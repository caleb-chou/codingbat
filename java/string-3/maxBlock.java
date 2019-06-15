/* 
 * Given a string, return the length of the largest "block"
 * in the string. A block is a run of adjacent chars that 
 * are the same.
 */
 
public int maxBlock(String str) {
  int count = 0;
  int top = 0;
  if(str.length() == 0) return 0;
  
  for(int i = 0; i < str.length() - 1; i++) {
    if(str.substring(i, i+1).equals(str.substring(i+1, i+2))) {
      count++;
    } else {
      count = 0;
    } 
    if(count > top) top = count;
  }
  return top + 1;
}
