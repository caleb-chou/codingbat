public int[] fizzArray3(int start, int end) {
  int[] fin = new int[end-start];
  for (int i = 0; i < fin.length; i++)
    fin[i] = start+i;
  return fin;
}
