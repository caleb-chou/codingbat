public boolean twoTwo(int[] nums) {
  if(nums.length ==1 && nums[0] == 2) return false;
  for(int i = 0; i < nums.length; i ++) {
    if(nums[i] == 2) {
      if(i == 0){
        if(!equalsnext(nums,i)) return false;
      } else if(i == nums.length-1){
        if(!equalsnext(nums,i-1)) return false;
      }else if(i < nums.length-1 && i > 0) {
        if(!equalsnext(nums,i) && !equalsnext(nums,i-1)) return false;
      }
    }
  }
  return true;
}

private boolean equalsnext(int[] nums,int i) {
  return nums[i]==nums[i+1];
}
