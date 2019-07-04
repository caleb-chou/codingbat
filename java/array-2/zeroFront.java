public int[] zeroFront(int[] nums) {
  int count = 0;
  for ( int i : nums ) if( i== 0 ) count++;
  int[] newnum = new int[nums.length];
  for(int i =count; i < nums.length; i++)
    for (int j = 0; j < nums.length; j++)
      if(nums[j]!=0)
        newnum[i] = nums[j];
  return newnum;
}
