/* 
 * Given a string, look for a mirror image (backwards) string 
 * at both the beginning and end of the given string. In other
 * words, zero or more characters at the very begining of the
 * given string, and at the very end of the string in reverse 
 * order (possibly overlapping). For example, the string "abXYZba" 
 * has the mirror end "ab".
 */
 
public String mirrorEnds(String string) {
  String strA = "";
  String strB = "";
  for(int i = 0; i < string.length(); i++) {
    if(!strA.equals(strB)) break;
    strA += string.substring(i, i+1);
    strB += string.substring(string.length() - i - 1, string.length() - i);
  }
  if(strA.equals(strB)) return strA;
  return strA.substring(0, strA.length() - 1);
}
