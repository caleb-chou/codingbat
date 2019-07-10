
/* 
 * Given a string, look for a mirror image (backwards) string 
 * at both the beginning and end of the given string. In other
 * words, zero or more characters at the very begining of the
 * given string, and at the very end of the string in reverse 
 * order (possibly overlapping). For example, the string "abXYZba" 
 * has the mirror end "ab".
 */
 
public static String sameEnds(String string) {
      String strA = "";
      String strB = "";
      String temp = "";
    
      for(int i = 0; i < string.length(); i++) {
        if(strA.equals(strB)) {
          temp = strA;
          strA = string.substring(0, i);
          System.out.println("A: " + strA);
          strB = string.substring(string.length() - i);
          System.out.println("B: " + strB);
        } else {
            System.out.println("broke");
          break;
        }
      }
      return strA;
    }
