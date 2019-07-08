/* 
 * Given a string, return the sum of the digits 0-9 that appear 
 * in the string, ignoring all other characters. Return 0 if there
 * are no digits in the string. (Note: Character.isDigit(char) tests 
 * if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) 
 * converts a string to an int.)
 */
 
public int sumDigits(String str) {
  if(str.equals("")) return 0;
  int sum = 0;
  String[] temp = str.replaceAll("[^0-9]", "0").split("");
  for(String s : temp) sum+= Integer.parseInt(s);
  return sum;
}

