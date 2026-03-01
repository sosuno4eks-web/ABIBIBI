package com.github.weisj.jsvg.parser;

final class CharacterDataParser {
   private static final boolean DEBUG = false;
   private CharacterDataParser.State state;
   private StringBuilder buffer;
   private char[] data;
   private int begin;
   private int end;

   CharacterDataParser() {
      this.state = CharacterDataParser.State.SEGMENT_START;
      this.buffer = new StringBuilder();
   }

   public void append(char[] ch, int offset, int length) {
      if (length != 0) {
         this.data = ch;
         this.begin = offset;
         this.end = offset + length;
         int segmentBreaks;
         if (isSegmentBreak(this.data[this.begin])) {
            segmentBreaks = this.trimLeadingWhiteSpace();
            if (this.state == CharacterDataParser.State.SEGMENT_BREAK) {
               ++segmentBreaks;
            }

            if (this.begin > offset && segmentBreaks > 1) {
               --this.begin;
               this.data[this.begin] = ' ';
               if (this.state == CharacterDataParser.State.CHARACTER || this.state == CharacterDataParser.State.SEGMENT_BREAK) {
                  this.state = CharacterDataParser.State.WHITESPACE_AFTER_CHAR;
               }
            }
         }

         segmentBreaks = this.trimTrailingWhiteSpace();
         if (this.end < offset + length) {
            this.data[this.end] = (char)(segmentBreaks > 0 ? 10 : 32);
            ++this.end;
         }

         if (this.begin < this.end) {
            this.buffer.ensureCapacity(this.buffer.length() + this.end - this.begin);
            this.appendData();
         }
      }
   }

   private void appendData() {
      for(int initialOffset = this.begin; this.begin < this.end; ++this.begin) {
         char c = this.data[this.begin];
         boolean segmentBreak = isSegmentBreak(c);
         boolean whiteSpace = isWhitespace(c);
         if (!segmentBreak && !whiteSpace) {
            if (this.state == CharacterDataParser.State.WHITESPACE_AFTER_CHAR || this.state.isVisualSpace && this.begin > initialOffset) {
               this.buffer.append(' ');
            }

            this.state = CharacterDataParser.State.CHARACTER;
            this.buffer.append(c);
         } else if (whiteSpace) {
            switch(this.state) {
            case CHARACTER:
            case WHITESPACE_AFTER_CHAR:
               this.state = CharacterDataParser.State.WHITESPACE_AFTER_CHAR;
               break;
            case SEGMENT_BREAK:
            case WHITESPACE_AFTER_SEGMENT_BREAK:
               this.state = CharacterDataParser.State.WHITESPACE_AFTER_SEGMENT_BREAK;
            }
         } else {
            this.state = CharacterDataParser.State.SEGMENT_BREAK;
         }
      }

   }

   public boolean canFlush(boolean dueToSegmentBreak) {
      if (this.state == CharacterDataParser.State.SEGMENT_START) {
         return false;
      } else {
         return dueToSegmentBreak || this.buffer.length() > 0;
      }
   }

   public char[] flush(boolean dueToSegmentBreak) {
      if (dueToSegmentBreak && this.state != CharacterDataParser.State.CHARACTER) {
         this.buffer.append(' ');
      }

      if (dueToSegmentBreak) {
         this.state = CharacterDataParser.State.SEGMENT_BREAK;
      }

      char[] ch = new char[this.buffer.length()];
      this.buffer.getChars(0, ch.length, ch, 0);
      this.buffer = new StringBuilder();
      return ch;
   }

   private int trimLeadingWhiteSpace() {
      int segmentBreakCount = 0;

      while(this.begin < this.end) {
         if (isSegmentBreak(this.data[this.begin])) {
            ++segmentBreakCount;
            ++this.begin;
         } else {
            if (!isWhitespace(this.data[this.begin])) {
               break;
            }

            ++this.begin;
         }
      }

      return segmentBreakCount;
   }

   private int trimTrailingWhiteSpace() {
      int segmentBreakCount = 0;

      while(this.begin < this.end) {
         if (isSegmentBreak(this.data[this.end - 1])) {
            ++segmentBreakCount;
            --this.end;
         } else {
            if (!isWhitespace(this.data[this.end - 1])) {
               break;
            }

            --this.end;
         }
      }

      return segmentBreakCount;
   }

   private static boolean isSegmentBreak(char c) {
      return c == '\n' || c == '\r';
   }

   private static boolean isWhitespace(char c) {
      return c == ' ' || c == '\t';
   }

   private static enum State {
      SEGMENT_START(false),
      SEGMENT_BREAK(true),
      WHITESPACE_AFTER_CHAR(true),
      WHITESPACE_AFTER_SEGMENT_BREAK(true),
      CHARACTER(false);

      private final boolean isVisualSpace;

      private State(boolean isVisualSpace) {
         this.isVisualSpace = isVisualSpace;
      }

      // $FF: synthetic method
      private static CharacterDataParser.State[] $values() {
         return new CharacterDataParser.State[]{SEGMENT_START, SEGMENT_BREAK, WHITESPACE_AFTER_CHAR, WHITESPACE_AFTER_SEGMENT_BREAK, CHARACTER};
      }
   }
}
