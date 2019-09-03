public int[] rotateLeft3(int[] nums) {
  int[] fin = new int[nums.length];
  int temp = nums[0];
  for(int i = 0; i < nums.length-1; i++) fin[i] = nums[i+1];
  fin[nums.length-1] = temp;
  return fin;
}
