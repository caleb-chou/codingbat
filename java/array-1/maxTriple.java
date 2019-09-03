public int maxTriple(int[] nums) {
  return (nums[0] >= nums[nums.length-1]) ? (nums[0] >= nums[(nums.length-1)/2]) ? nums[0]:nums[(nums.length-1)/2] : (nums[nums.length-1]>=nums[(nums.length-1)/2]) ? nums[nums.length-1] : nums[(nums.length-1)/2]; 
}
