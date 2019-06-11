/* 
 * Given a string, return true if the first 2 chars in the 
 * string also appear at the end of the string, such as with "edited".
 */
 
public boolean frontAgain(String s) {
  return s.length()>=2&&(s.substring(s.length()-2).equals(s.substring(0,2)));
}
