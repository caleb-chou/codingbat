/* 
 * Given a string, look for a mirror image (backwards) string 
 * at both the beginning and end of the given string. In other
 * words, zero or more characters at the very begining of the
 * given string, and at the very end of the string in reverse 
 * order (possibly overlapping). For example, the string "abXYZba" 
 * has the mirror end "ab".
 */
 
public String sameEnds(String string) {
  String strA = "";
  String strB = "";
  boolean same = strA.equals(strB);
  int idx = 0;
  String temp = "";

  for(int i = 0; i < string.length(); i++) {
     temp = strA;
    if(same) {
      strA = string.substring(0, idx);
      strB = string.substring(string.length() - idx);
      idx++;
    } else {
      break;
    }
  }

  return temp;
}
