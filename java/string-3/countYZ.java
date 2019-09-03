/*
 * Given a string, count the number of words ending in 'y' or 'z' -- so 
 * the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" 
 * (not case sensitive). We'll say that a y or z is at the end of a word if there 
 * is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) 
 * tests if a char is an alphabetic letter.)
 */

public int countYZ(String str) {
  return str.length() - str.replaceAll("(y|Y)(?![a-zA-Z])|(z|Z)(?![a-zA-Z])","").length();
}
