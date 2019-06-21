// Given an array of ints, return true if it contains no 1's or it contains no 4's.

public boolean no14(int[] nums) {
  if(Arrays.toString(nums).contains("1") && Arrays.toString(nums).contains("4")) {
    return false;
  } else if(Arrays.toString(nums).contains("1") || Arrays.toString(nums).contains("4")) {
    return true;
  }
  return true;
}
