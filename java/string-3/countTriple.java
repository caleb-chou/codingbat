/* 
 * We'll say that a "triple" in a string is a char appearing 
 * three times in a row. Return the number of triples in the given 
 * string. The triples may overlap.
 */
 
public int countTriple(String str) {
  int count = 0;
  for(int i =0 ; i < str.length()-2; i++)
    if(str.substring(i,i+3).matches("(.)\\1{2,}")) count++;
  return count;
}
