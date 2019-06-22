public int[] frontPiece(int[] nums) {
  int[] frontpiece = new int[(nums.length >= 2) ? 2 : nums.length];
  for(int i =0 ; i < nums.length && i < 2; i++) frontpiece[i] = nums[i];
  return frontpiece;
}
