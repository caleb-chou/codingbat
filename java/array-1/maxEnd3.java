public int[] maxEnd3(int[] nums) {
  int max = (nums[0] >= nums[nums.length-1]) ? nums[0] : nums[nums.length-1];
  int[] fin = {max,max,max};
  return fin;
}
