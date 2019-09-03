public String doubleChar(String str) {
  String r="";
  for(char c:str.toCharArray()) r=r+c+c;
  return r;
}