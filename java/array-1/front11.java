public int[] front11(int[] a, int[] b) {
  int[] fin = new int[((a.length > 0) ? 1 : 0) + ((b.length > 0) ? 1 : 0)];
  if(fin.length > 0) fin[0] = (a.length > 0) ? a[0] : b[0];
  if(fin.length > 1) fin[1] = b[0];
  return fin;
}
