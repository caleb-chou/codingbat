/* 
 * We'll say that a "triple" in a string is a char appearing 
 * three times in a row. Return the number of triples in the given 
 * string. The triples may overlap.
 */
 
public int countTriple(String str) {
  int count = 0;
  
  if(str.length()>2) {
    for(int i = 0; i < str.length()-2; i++) {
      if(str.substring(i,i+1).equals(str.substring(i+1, i+2)) && str.substring(i+1, i+2).equals(str.substring(i+2, i+3)))
        count++;
    }
  }
  return count;
}
