public int[] swapEnds(int[] nums) {
  int[] fin = nums.clone();
  fin[0] = nums[nums.length-1];
  fin[fin.length-1] = nums[0];
  return fin;
}
