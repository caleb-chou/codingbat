/*
 * Given a string, count the number of words ending in 'y' or 'z' -- so 
 * the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" 
 * (not case sensitive). We'll say that a y or z is at the end of a word if there 
 * is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) 
 * tests if a char is an alphabetic letter.)
 */

public int countYZ(String str) {
  int count = 0;
 
  for(int i = 0; i < str.length(); i++) {
    String curr = str.substring(i, i+1).toLowerCase();
    
    if(i != 0 && !Character.isLetter(str.charAt(i))) {
      String prev = str.substring(i-1, i).toLowerCase();
      if(prev.equals("y") || prev.equals("z")) count++;
    }
    
    if(i == str.length() - 1 && (curr.equals("y") || curr.equals("z"))) count++;
  }
  return count;
}
