/* Generated By:JJTree&JavaCC: Do not edit this line. BwyGrammarTokenManager.java */
package dd;
import utils.*;

/** Token Manager. */
public class BwyGrammarTokenManager implements BwyGrammarConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fffff800000L) != 0L)
         {
            jjmatchedKind = 56;
            return 4;
         }
         if ((active0 & 0x400000L) != 0L)
            return 10;
         return -1;
      case 1:
         if ((active0 & 0x11040000000L) != 0L)
            return 4;
         if ((active0 & 0x3eefbf800000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 1;
            }
            return 4;
         }
         return -1;
      case 2:
         if ((active0 & 0x8008000000L) != 0L)
            return 4;
         if ((active0 & 0x3e6ff7800000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 2;
            return 4;
         }
         return -1;
      case 3:
         if ((active0 & 0x284113000000L) != 0L)
            return 4;
         if ((active0 & 0x162ee4800000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 3;
            return 4;
         }
         return -1;
      case 4:
         if ((active0 & 0x1002a4000000L) != 0L)
            return 4;
         if ((active0 & 0x62c40800000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 4;
            return 4;
         }
         return -1;
      case 5:
         if ((active0 & 0x60040000000L) != 0L)
            return 4;
         if ((active0 & 0x2c00800000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 5;
            return 4;
         }
         return -1;
      case 6:
         if ((active0 & 0x2800800000L) != 0L)
            return 4;
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 6;
            return 4;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 37:
         return jjStopAtPos(0, 16);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 40:
         return jjStopAtPos(0, 46);
      case 41:
         return jjStopAtPos(0, 47);
      case 42:
         return jjStopAtPos(0, 21);
      case 43:
         jjmatchedKind = 19;
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 44:
         return jjStopAtPos(0, 60);
      case 45:
         jjmatchedKind = 20;
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 47:
         return jjStartNfaWithStates_0(0, 22, 10);
      case 59:
         return jjStopAtPos(0, 59);
      case 60:
         jjmatchedKind = 9;
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 61:
         jjmatchedKind = 7;
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 62:
         jjmatchedKind = 8;
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 91:
         return jjStopAtPos(0, 48);
      case 93:
         return jjStopAtPos(0, 49);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x82800000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x701000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1840000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x8020000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x10008000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x40004000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 123:
         return jjStopAtPos(0, 50);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 125:
         return jjStopAtPos(0, 51);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      case 43:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         break;
      case 45:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         break;
      case 61:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         else if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         else if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(1, 12);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200100000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x20800000000L);
      case 102:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 40, 4);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x100005000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x4020000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 111:
         if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x88650800000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x2002000000L);
      case 124:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x3c0000000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x610000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x24800000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 114:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 39, 4);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x4100000000L);
      case 116:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 4);
         return jjMoveStringLiteralDfa3_0(active0, 0x20002000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x8a0000000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 100:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 43, 4);
         break;
      case 101:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 4);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 4);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 38, 4);
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000L);
      case 103:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 4);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000800000L);
      case 110:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 45, 4);
         break;
      case 114:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 4);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x40400000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000L);
      case 101:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 44, 4);
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      case 107:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 4);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000L);
      case 116:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(4, 26, 4);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 4);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 4);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 101:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 30, 4);
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000000L);
      case 104:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 42, 4);
         break;
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000L);
      case 110:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 41, 4);
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 102:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 37, 4);
         break;
      case 110:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(6, 23, 4);
         break;
      case 116:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 35, 4);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(7, 34, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 21;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 10:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(16, 17);
                  else if (curChar == 47)
                     jjCheckNAddStates(0, 2);
                  break;
               case 0:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  else if (curChar == 47)
                     jjAddStates(3, 4);
                  else if (curChar == 48)
                  {
                     if (kind > 52)
                        kind = 52;
                     jjCheckNAddStates(5, 7);
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 5:
                  if (curChar != 48)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAddStates(5, 7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAddTwoStates(7, 2);
                  break;
               case 8:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAddTwoStates(8, 2);
                  break;
               case 9:
                  if (curChar == 47)
                     jjAddStates(3, 4);
                  break;
               case 11:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 12:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 13:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 14:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(16, 17);
                  break;
               case 16:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(16, 17);
                  break;
               case 17:
                  if (curChar == 42)
                     jjAddStates(8, 9);
                  break;
               case 18:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(19, 17);
                  break;
               case 19:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(19, 17);
                  break;
               case 20:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 4:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  jjCheckNAdd(4);
                  break;
               case 2:
                  if ((0x100000001000L & l) != 0L && kind > 52)
                     kind = 52;
                  break;
               case 6:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAddTwoStates(7, 2);
                  break;
               case 11:
                  jjAddStates(0, 2);
                  break;
               case 16:
                  jjCheckNAddTwoStates(16, 17);
                  break;
               case 18:
               case 19:
                  jjCheckNAddTwoStates(19, 17);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 11:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               case 16:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(16, 17);
                  break;
               case 18:
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(19, 17);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 21 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   11, 12, 14, 10, 15, 6, 8, 2, 18, 20, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\75", "\76", "\74", "\75\75", 
"\74\75", "\76\75", "\41\75", "\53\53", "\55\55", "\45", "\46\46", "\174\174", "\53", 
"\55", "\52", "\57", "\142\157\157\154\145\141\156", "\143\150\141\162", 
"\142\171\164\145", "\163\150\157\162\164", "\151\156\164", "\154\157\156\147", 
"\146\154\157\141\164", "\144\157\165\142\154\145", "\142\162\145\141\153", "\143\141\163\145", 
"\143\157\156\163\164", "\143\157\156\164\151\156\165\145", "\144\145\146\141\165\154\164", 
"\144\157", "\164\171\160\145\144\145\146", "\145\154\163\145", "\146\157\162", 
"\151\146", "\162\145\164\165\162\156", "\163\167\151\164\143\150", "\166\157\151\144", 
"\167\150\151\154\145", "\155\141\151\156", "\50", "\51", "\133", "\135", "\173", "\175", null, null, 
null, null, null, null, null, "\73", "\54", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x191fffffffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[21];
private final int[] jjstateSet = new int[42];
protected char curChar;
/** Constructor. */
public BwyGrammarTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public BwyGrammarTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 21; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}