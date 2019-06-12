/*
 * Given a string, return true if the number of appearances of 
 * "is" anywhere in the string is equal to the number of appearances of
 * "not" anywhere in the string (case sensitive).
 */
 
public boolean equalIsNot(String str) {
  int countIs = 0;
  int countNot = 0;

    for(int i = 0; i < str.length()-1; i++) {
      if(str.substring(i, i+2).equals("is"))
        countIs++;
    }
    for(int i = 0; i < str.length()-2; i++) {
      if(str.substring(i, i+3).equals("not"))
        countNot++;
    }
  
  if(countIs==countNot)
    return true;
  
  return false;
}
