/* 
 * Given a string, return the sum of the numbers 
 * appearing in the string, ignoring all other 
 * characters. A number is a series of 1 or more
 * digit chars in a row. (Note: Character.isDigit(char)
 * tests if a char is one of the chars '0', '1', .. '9'. 
 * Integer.parseInt(string) converts a string to an int.)
 */
 
public int sumNumbers(String str) {
  int sum = 0;      
  String num = "";

  for(int i = 0; i < str.length(); i++) {
    if(Character.isDigit(str.charAt(i))) {
      if(i < str.length() - 1 && Character.isDigit(str.charAt(i+1))) {
        num += str.charAt(i);
      } else {
        num += str.charAt(i);
        sum += Integer.parseInt(num);
        num = "";
      }
    }
  }
  return sum; 
}
