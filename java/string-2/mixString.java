public String mixString(String a, String b) {
  int length = (a.length()>=b.length()) ? a.length():b.length();
  String temp="";
  for(int i = 0;i<length;i++) {
    temp+=(i<a.length()) ? a.charAt(i):"";
    temp+=(i<b.length()) ? b.charAt(i):"";
  }
  return temp;
}
