public boolean double23(int[] nums) {
  int two = 0,three = 0;
  for (int i : nums) if(i ==2) two++; else if(i==3) three++;
  return (two == 2 || three ==2);
}
