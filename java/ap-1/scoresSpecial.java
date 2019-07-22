public int scoresSpecial(int[] a, int[] b) {
    return largestSpecial(a) + largestSpecial(b);
}

public int largestSpecial(int[] a) {
    int max = 0, temp = 0;
    
    for(int n : a) {
      if(n % 10 == 0 && n > max) max = n;
    }
  return max;
}
