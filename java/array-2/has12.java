/* Given an array of ints, return true if there is 
 * a 1 in the array with a 2 somewhere later in the array.
 */

public boolean has12(int[] nums) {
  boolean has1 = false;
  for (int i : nums)
    if(i==1 && !has1) has1 = true;
    else if (i==2 && has1) return true;
  return false;
}
