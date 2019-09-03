public int sum67(int[] nums) {
  int sum =0;
  boolean adding = true;
  for(int i = 0; i < nums.length;i++) {
    if(nums[i]==6) { 
      adding = false;
    }
    if(adding) sum += nums[i];
    if(nums[i]==7){
      adding = true;
    }
  }
  return sum;
}
