/* 
 * Given a string, look for a mirror image (backwards) string 
 * at both the beginning and end of the given string. In other
 * words, zero or more characters at the very begining of the
 * given string, and at the very end of the string in reverse 
 * order (possibly overlapping). For example, the string "abXYZba" 
 * has the mirror end "ab".
 */
 
public String mirrorEnds(String string) {
  String forward = "",backward = "";
  for(int i = 0; i < string.length(); i++) {
    if(!forward.equals(backward)) return forward.substring(0,i-1);
    forward += string.charAt(i);
    backward+= string.charAt(string.length()-1-i);
  }
  return forward;
}
