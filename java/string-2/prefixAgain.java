public boolean prefixAgain(String str, int n) {
  String pref = str.substring(0,n);
  for(int i = n;istr.length()-n+1;i++) {
    if(pref.equals(str.substring(i,i+n)))
      return true;
  }
  return false;
}
