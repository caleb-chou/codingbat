
/* 
 * Given a string, look for a mirror image (backwards) string 
 * at both the beginning and end of the given string. In other
 * words, zero or more characters at the very begining of the
 * given string, and at the very end of the string in reverse 
 * order (possibly overlapping). For example, the string "abXYZba" 
 * has the mirror end "ab".
 */
 
public String sameEnds(String string) {
  String returnme = "";
  for(int i = 1; i < string.length()/2 + 1; i++)
    if(string.substring(0,i).equals(string.substring(string.length()-i))) 
      returnme = string.substring(0,i);
  return returnme;
}
