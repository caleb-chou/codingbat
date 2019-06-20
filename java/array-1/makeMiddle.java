public int[] makeMiddle(int[] nums) {
  int mid = (nums.length-1)/2;
  int[] middle = {nums[mid],nums[mid+1]};
  return middle;
}
