/*
 * Given a string, if the first or last chars are 'x', return
 * the string without those 'x' chars, and otherwise return the
 * string unchanged.
 */
 
public String withoutX(String str) {
  String output = str;
  if(str.length() > 1) {
    if(str.substring(0,1).equals("x"))
      output = str.substring(1);
    if(str.substring(str.length() - 1, str.length()).equals("x"))
     return output.substring(0, output.length() - 1);
  }
  if(str.length() == 1) return "";
  return output;
}
