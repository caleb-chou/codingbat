public int[] copyEvens(int[] nums, int count) {
  int ct = 0;
  int[] output = new int[count];
  
  for(int n: nums) {
     if(n % 2 == 0 && ct < count) {
      output[ct] = n;
      ct++;
    }
  }
  return output;
}
