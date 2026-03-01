package com.github.weisj.jsvg.parser.css.impl;

import com.github.weisj.jsvg.parser.css.CssParser;
import com.github.weisj.jsvg.parser.css.StyleProperty;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

public final class SimpleCssParser implements CssParser {
   private static final Logger LOGGER = Logger.getLogger(SimpleCssParser.class.getName());

   @NotNull
   public SimpleStyleSheet parse(@NotNull List<char[]> input) {
      return (new SimpleCssParser.Parser(input)).parse();
   }

   private static final class Parser {
      @NotNull
      private final Lexer lexer;
      @NotNull
      private final SimpleStyleSheet sheet;
      @NotNull
      private Token current;

      private Parser(@NotNull List<char[]> input) {
         this.sheet = new SimpleStyleSheet();
         this.current = new Token(TokenType.START);
         this.lexer = new Lexer(input);
      }

      private void next() {
         Token next;
         do {
            next = this.lexer.nextToken();
         } while(next.type() == TokenType.COMMENT);

         this.current = next;
      }

      private void expected(@NotNull String type) {
         SimpleCssParser.LOGGER.warning(() -> {
            return MessageFormat.format("Expected ''{0}'' but got ''{1}''", type, this.current);
         });
      }

      private void consumeOrSkipAllowedToken(TokenType type, TokenType allowedTokeToSkip) {
         if (this.current.type() != type) {
            if (this.current.type() != allowedTokeToSkip) {
               this.expected(type.toString());
               throw new ParserException();
            }
         } else {
            this.next();
         }
      }

      private void consume(TokenType type) {
         this.consumeOrSkipAllowedToken(type, (TokenType)null);
      }

      @NotNull
      private String consumeValue(TokenType type) {
         if (this.current.type() != type) {
            this.expected(type.toString());
            throw new ParserException();
         } else if (this.current.data() == null) {
            throw new ParserException();
         } else {
            String value = (String)Objects.requireNonNull(this.current.data());
            this.next();
            return value;
         }
      }

      @NotNull
      private List<Token> readIdentifierList() {
         ArrayList list = new ArrayList();

         while(this.current.type() != TokenType.CURLY_OPEN && this.current.type() != TokenType.EOF) {
            TokenType type = this.current.type();
            if (type != TokenType.IDENTIFIER && type != TokenType.ID_NAME && type != TokenType.CLASS_NAME) {
               this.expected("identifier");
               throw new ParserException();
            }

            list.add(this.current);
            this.next();
            if (this.current.type() != TokenType.COMMA) {
               break;
            }

            this.next();
         }

         return list;
      }

      @NotNull
      private List<StyleProperty> readProperties() {
         List<StyleProperty> list = new ArrayList();
         this.consume(TokenType.CURLY_OPEN);

         while(this.current.type() != TokenType.CURLY_CLOSE && this.current.type() != TokenType.EOF) {
            String name = this.consumeValue(TokenType.IDENTIFIER);
            this.consume(TokenType.COLON);
            String value = this.consumeValue(TokenType.RAW_DATA);
            this.consumeOrSkipAllowedToken(TokenType.SEMICOLON, TokenType.CURLY_CLOSE);
            list.add(new StyleProperty(name, value.trim()));
         }

         this.consume(TokenType.CURLY_CLOSE);
         return list;
      }

      private void skipToNextDefinition() {
         while(this.current.type() != TokenType.CURLY_CLOSE && this.current.type() != TokenType.EOF) {
            try {
               this.next();
            } catch (ParserException var2) {
            }
         }

         if (this.current.type() != TokenType.EOF) {
            this.current = new Token(TokenType.START);
         }

      }

      @NotNull
      SimpleStyleSheet parse() {
         do {
            try {
               if (this.current.type() == TokenType.START) {
                  this.next();
               }

               List<Token> identifierList = this.readIdentifierList();
               List<StyleProperty> properties = this.readProperties();
               Iterator var3 = identifierList.iterator();

               while(var3.hasNext()) {
                  Token token = (Token)var3.next();
                  switch(token.type()) {
                  case CLASS_NAME:
                     this.sheet.addClassRules((String)Objects.requireNonNull(token.data()), properties);
                     break;
                  case ID_NAME:
                     this.sheet.addIdRules((String)Objects.requireNonNull(token.data()), properties);
                     break;
                  case IDENTIFIER:
                     this.sheet.addTagNameRules((String)Objects.requireNonNull(token.data()), properties);
                     break;
                  default:
                     throw new IllegalStateException("Toke = " + token);
                  }
               }
            } catch (ParserException var5) {
               this.skipToNextDefinition();
            }
         } while(this.current.type() != TokenType.EOF);

         return this.sheet;
      }

      // $FF: synthetic method
      Parser(List x0, Object x1) {
         this(x0);
      }
   }
}
