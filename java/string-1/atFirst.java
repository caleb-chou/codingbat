/* 
 * Given a string, return a string length 2 made of its first 2
 * chars. If the string length is less than 2, use '@' for the 
 * missing chars.
 */
 
public String atFirst(String in) {
  return(in.length()>=2) ? in.substring(0,2):(in.length()==0)?"@@":in+"@";
}
