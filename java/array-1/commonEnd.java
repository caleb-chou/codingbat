public boolean commonEnd(int[] a, int[] b) {
  return (a.length > 0 && b.length > 0) ? (a[a.length-1]==b[b.length-1] || a[0]==b[0]):false;
}
