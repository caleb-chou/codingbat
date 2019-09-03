public int[] pre4(int[] nums) {
  int i =0;
  for(; i < nums.length; i++)
    if(nums[i]==4) break;
  int[] returnme = new int[i];
  for(int j = 0; j < i; j++)
    returnme[j] = nums[j];
  return returnme;
}
