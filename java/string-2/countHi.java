public int countHi(String str) {
  int s=0;
  for(int i=0;i<str.length()-1;i++) {
    s+=(str.substring(i,i+2).equals("hi")) ? 1:0;
  }
  return s;
}
