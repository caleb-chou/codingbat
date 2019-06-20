public int[] biggerTwo(int[] a, int[] b) {
  return (sum(a) >= sum(b)) ?  a : b;
}
private int sum(int[] c) {
  int sum = 0; 
  for(int i : c) sum += i;
  return sum;
}
