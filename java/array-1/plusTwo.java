public int[] plusTwo(int[] a, int[] b) {
  int[] fin = new int[a.length + b.length];
  for(int i = 0; i < fin.length;) {
    for(int j : a) fin[i++] = j;
    for(int k : b) fin[i++] = k;
  }
  return fin;
}
