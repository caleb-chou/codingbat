public int[] copyEndy(int[] nums, int count) {
  int[] output = new int[count];
  int ct = 0;
  
  for(int n : nums) {
    if(isEndy(n) && ct < count) {
      output[ct] = n;
      ct++;
    }
  }
  return output;
}

public boolean isEndy(int n) {
  return n >= 0 && n <= 10 || n >= 90 && n <= 100;
}
