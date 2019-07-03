public int[] tenRun(int[] nums) {
 boolean change = false;
 int changeTo =0;
 for(int i = 0; i < nums.length; i++)
   if(nums[i]%10==0) {
     changeTo = nums[i];
     if(!change) change = true;
   }
   else if(nums[i]%10!=0 && change) nums[i] = changeTo;
 return nums;
}
