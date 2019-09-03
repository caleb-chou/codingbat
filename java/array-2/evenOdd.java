public int[] evenOdd(int[] nums) {
  int[] newarr = new int[nums.length];
  int even =0,odd =0;
  for (int i = 0; i < nums.length; i++)
    if(nums[i] %2 ==1) newarr[nums.length-(++odd)] = nums[i];
    else newarr[even++] = nums[i];
  return newarr;
}
