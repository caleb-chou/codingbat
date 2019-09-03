public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk) return (b < c);
  return a < b && b < c;
}
