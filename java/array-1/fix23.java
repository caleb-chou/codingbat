public int[] fix23(int[] nums) {
  int[] fin = nums;
  for(int i =1 ; i < 3; i++) {
    if(nums[i-1]==2 && nums[i]==3) nums[i]=0;
  }
  return fin;
}
