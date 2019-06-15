public int[] reverse3(int[] nums) {
  int[] x = new int[3];
  for(int i = 0; i < 3; i++) x[2-i] = nums[i];
  return x;
}
