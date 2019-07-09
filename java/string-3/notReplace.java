/* 
 * Given a string, return a string where every appearance of 
 * the lowercase word "is" has been replaced with "is not". The
 * word "is" should not be immediately preceeded or followed by 
 * a letter -- so for example the "is" in "this" does not count. 
 * (Note: Character.isLetter(char) tests if a char is a letter.)
 */
 
public String notReplace(String str) {
  if(str.length() < 3) {
    if(str.equals("is")) return str + " not";
    return str;
  }
  boolean startsWith = str.substring(0, 2).equals("is") && !Character.isLetter(str.charAt(2));
  boolean endsWith = str.substring(str.length() - 2, str.length()).equals("is") && !Character.isLetter(str.charAt(str.length() - 3));
  String output = str.replaceAll(" is ", " is not ");

  if(startsWith)
    output = "is not" + output.substring(2);
  if(endsWith)
    output += " not";
    
  return output;
}
