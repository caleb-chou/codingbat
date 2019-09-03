public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] returnthis = new String[n];
  int x = 0, y = 0;
  for (int i = 0 ; i < n; i++) {
    if (a[x].charAt(0) == b[y].charAt(0))
      returnthis[i] = "" + a[x++].charAt(0);
      y++;
    else if (a[x].charAt(0) < b[y].charAt(0))
      returnthis[i] = "" + a[x++].charAt(0);
    else
      returnthis[i] = "" +  b[y++].charAt(0);
  }
  return returnthis;
}
