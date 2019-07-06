public int[] zeroMax(int[] nums) {
  for (int i = 0; i < nums.length-1; i++)
    if(nums[i] == 0)
      for(int j = i; j < nums.length; j++)
        nums[i] = (nums[j] % 2 == 1 && nums[j] > nums[i]) ? nums[j] : nums[i];
  return nums;
}
