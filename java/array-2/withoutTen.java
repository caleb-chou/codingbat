public int[] withoutTen(int[] nums) {
  int[] output = new int[nums.length];
  int count = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] != 10) {
      output[count] = nums[i];
      count++;
    }
  }
  for(int j = count; j < nums.length; j++) {
    output[j] = 0;
  }
  return output;
}
