public boolean sameStarChar(String str) {
  if(str.isEmpty()||!str.contains("*")||str.matches("[*]+")) return true;
  for(int i=str.length()-1;i>1;i--) {
    if(str.charAt(i)=='*'&&i!=str.length()-1) {
      if(str.charAt(i-1)==str.charAt(i+1))
      return true;
      return false;
    }
  }
  return false;
}
