/* Given an array of ints, return true if the value 3 appears in the array exactly 3 
 * times, and no 3's are next to each other.
 */

public boolean haveThree(int[] nums) {
  if(count(nums,3)!=3) return false;
  for(int i =1; i < nums.length-1; i++)
    if((nums[i-1]==nums[i] && nums[i]==3) ||(nums[i+1]==nums[i] && nums[i]==3)) return false;
  return true;
}
private int count(int[]nums,int num) {
  int numnum = 0;
  for(int i : nums) if(i==num) numnum++;
  return numnum;
}

