public boolean unlucky1(int[] nums) {
  return (nums.length >= 2) ? (nums[0]==1&&nums[1]==3)||(nums[1]==1&&nums[2]==3)||(nums[nums.length-2]==1&&nums[nums.length-1]==3):false;
}
