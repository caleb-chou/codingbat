public String repeatFront(String str, int n) {
  int x = n;
  String s = "";
  for(int i = 0; i<n; i++) {
    s+=str.substring(0,x);
    x--;
  }
  return s;
}
