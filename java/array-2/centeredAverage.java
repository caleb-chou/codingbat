public int centeredAverage(int[] nums) {
  int min = nums[0],max = nums[0];
  int sum = 0;
  for(int i = 0 ; i < nums.length;i++) {
    if(nums[i] > max) max = nums[i];
    else if(nums[i]<min) min = nums[i];
    sum += nums[i];
  }
  return (sum - min - max) / (nums.length-2);
}
