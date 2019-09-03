public int[] makeLast(int[] nums) {
  int[] fin = new int[nums.length*2];
  fin[fin.length-1] = nums[nums.length-1];
  return fin;
}
