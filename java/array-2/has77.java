public boolean has77(int[] nums) {
  for (int i =0 ; i < nums.length-1; i++ )
    if(nums[i] == 7 && nums[i+1] == nums[i]) return true;
    else if(i < nums.length-2) if(nums[i]==7 && nums[i+2] == nums[i]) return true;
  return false;
}
