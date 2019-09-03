public String oneTwo(String str) {
  String temp = "";
  if(str.length()<3) return "";
  for(int i=0;i<str.length();i+=3) if(i+3<=str.length())temp+= str.substring(i+1,i+3)+str.charAt(i);
  return temp;
}
