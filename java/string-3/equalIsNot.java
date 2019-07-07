/*
 * Given a string, return true if the number of appearances of 
 * "is" anywhere in the string is equal to the number of appearances of
 * "not" anywhere in the string (case sensitive).
 */
 
public boolean equalIsNot(String str) {
  return (str.length() - str.replaceAll("is", "").length())/2 ==(str.length() - (str.replaceAll("not", "").length()))/3;
}
