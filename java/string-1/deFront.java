/*
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if 
 * it is 'b'. The string may be any length. Harder than it looks.
 */
 
public String deFront(String str) {    
  String output = "";
  if(str.length() > 1) {
    if(str.substring(0,1).equals("a"))
      output += "a";
    if(str.substring(1,2).equals("b"))
      output += "b";
    return output + str.substring(2, str.length());
  }
  return str;
}
