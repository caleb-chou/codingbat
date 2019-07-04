public int[] post4(int[] nums) {
  int i = nums.length-1;
  for ( ; i>0 ; i-- )if(nums[i]==4) break;
  int[] returnme = new int[nums.length-i-1];
  for (int j = 0; j < returnme.length; j++) returnme[j] = nums[i+j+1];
  return returnme;
}
