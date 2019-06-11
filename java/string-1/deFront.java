/*
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if 
 * it is 'b'. The string may be any length. Harder than it looks.
 */
 
public String deFront(String in) {    
  return (in.charAt(0)=='a') ? ((in.charAt(1)=='b') ? in:in.charAt(0) + in.substring(2)):((in.charAt(1)=='b') ? in.substring(1):in.substring(2));
}

