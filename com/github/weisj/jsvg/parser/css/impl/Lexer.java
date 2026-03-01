package com.github.weisj.jsvg.parser.css.impl;

import java.text.MessageFormat;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

public final class Lexer {
   private static final Logger LOGGER = Logger.getLogger(Lexer.class.getName());
   @NotNull
   private final List<char[]> input;
   private int listIndex = 0;
   private int index = 0;
   private boolean inRuleDefinition;
   private boolean parsingRaw;

   public Lexer(@NotNull List<char[]> input) {
      this.input = input;
   }

   @NotNull
   public Token nextToken() {
      this.consumeWhiteSpace();
      if (this.inRuleDefinition && this.parsingRaw) {
         this.parsingRaw = false;
         return new Token(TokenType.RAW_DATA, this.readWhile((cx) -> {
            return cx != ';' && cx != '}';
         }));
      } else if (this.isEof()) {
         return new Token(TokenType.EOF);
      } else {
         char c = this.current();
         switch(c) {
         case '#':
            this.next();
            return new Token(TokenType.ID_NAME, this.readIdentifier());
         case ',':
            this.next();
            return new Token(TokenType.COMMA);
         case '.':
            this.next();
            return new Token(TokenType.CLASS_NAME, this.readIdentifier());
         case '/':
            if (this.peekNext() == '*') {
               this.next();
               this.next();
               String comment = this.readWhile((n) -> {
                  return n != '*' || this.peekNext() != '/';
               });
               this.next();
               this.next();
               return new Token(TokenType.COMMENT, comment);
            }
         default:
            return new Token(TokenType.IDENTIFIER, this.readIdentifier());
         case ':':
            this.parsingRaw = true;
            this.next();
            return new Token(TokenType.COLON);
         case ';':
            this.next();
            return new Token(TokenType.SEMICOLON);
         case '{':
            this.inRuleDefinition = true;
            this.parsingRaw = false;
            this.next();
            return new Token(TokenType.CURLY_OPEN);
         case '}':
            this.inRuleDefinition = false;
            this.parsingRaw = false;
            this.next();
            return new Token(TokenType.CURLY_CLOSE);
         }
      }
   }

   private boolean isEof() {
      return this.listIndex >= this.input.size() || this.listIndex == this.input.size() - 1 && this.index >= ((char[])this.input.get(this.listIndex)).length;
   }

   private void consumeWhiteSpace() {
      while(Character.isWhitespace(this.current())) {
         this.next();
      }

   }

   private boolean isIdentifierCharStart(char c) {
      if ('A' <= c && c <= 'Z') {
         return true;
      } else if ('a' <= c && c <= 'z') {
         return true;
      } else if (c == '-') {
         return true;
      } else {
         return c == '_';
      }
   }

   private boolean isIdentifierChar(char c) {
      if (this.isIdentifierCharStart(c)) {
         return true;
      } else {
         return '0' <= c && c <= '9';
      }
   }

   @NotNull
   private String readIdentifier() {
      if (this.isIdentifierCharStart(this.current()) && this.isIdentifierChar(this.current())) {
         return this.readWhile(this::isIdentifierChar);
      } else {
         LOGGER.warning(() -> {
            return MessageFormat.format("Identifier starting with unexpected char ''{0}''", this.current());
         });
         if (this.readWhile(this::isIdentifierChar).isEmpty()) {
            this.next();
         }

         throw new ParserException();
      }
   }

   @NotNull
   private String readWhile(@NotNull Predicate<Character> filter) {
      if (this.isEof()) {
         return "";
      } else {
         int startListIndex = this.listIndex;
         int startIndex = this.index;

         while(!this.isEof() && filter.test(this.current())) {
            this.next();
         }

         int endListIndex = this.isEof() ? this.input.size() - 1 : this.listIndex;
         int endIndex = this.isEof() ? ((char[])this.input.get(endListIndex)).length - 1 : this.index;
         StringBuilder builder = new StringBuilder();
         int start = startIndex;

         for(int i = startListIndex; i <= endListIndex; ++i) {
            char[] segment = (char[])this.input.get(i);
            int end = i == endListIndex ? endIndex : segment.length;
            builder.append(String.valueOf(segment, start, end - start));
            start = 0;
         }

         return builder.toString();
      }
   }

   private char current() {
      return this.isEof() ? '\u0000' : ((char[])this.input.get(this.listIndex))[this.index];
   }

   private char peekNext() {
      if (this.isEof()) {
         return '\u0000';
      } else if (this.index + 1 < ((char[])this.input.get(this.listIndex)).length) {
         return ((char[])this.input.get(this.listIndex))[this.index + 1];
      } else {
         for(int currentIndex = this.listIndex + 1; currentIndex < this.input.size(); ++currentIndex) {
            if (((char[])this.input.get(currentIndex)).length > 0) {
               return ((char[])this.input.get(currentIndex))[0];
            }
         }

         return '\u0000';
      }
   }

   private void next() {
      ++this.index;
      if (this.index >= ((char[])this.input.get(this.listIndex)).length && this.listIndex + 1 < this.input.size()) {
         this.index = 0;
         ++this.listIndex;
      }

   }
}
