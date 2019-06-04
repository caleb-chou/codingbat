/* 
 * Given two strings, append them together (known as "concatenation") 
 * and return the result. However, if the concatenation creates a 
 * double-char, then omit one of the chars, so "abc" and "cat" yields 
 * "abcat".
 */

public String conCat(String strA, String strB) {
  if(!(strA.length() == 0 || strB.length() == 0) && strA.substring(strA.length() - 1, strA.length()).equals(strB.substring(0, 1))) {
    return strA + strB.substring(1, strB.length());
  } else {
    return strA + strB;
  }
}
