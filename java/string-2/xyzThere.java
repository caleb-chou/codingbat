public boolean xyzThere(String str) {
  if(str.isEmpty()||str.length()<3) return false;
  if(str.substring(0,3).equals("xyz"))return true;
  for(int i = 1;i<str.length()-2;i++) {
    if(str.substring(i,i+3).equals("xyz")&&str.charAt(i-1)!='.') return true;
  }
  return false;
}
