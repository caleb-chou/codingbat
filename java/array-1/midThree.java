public int[] midThree(int[] nums) {
  int mid = nums.length/2 - 1;
  int[] middle = new int[3];
  for (int i =0 ; i < 3; i++) middle[i] = nums[mid+i];
  return middle;
}
