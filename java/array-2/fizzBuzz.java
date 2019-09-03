public String[] fizzBuzz(int start, int end) {
  String[] bizzfuzz = new String[end-start];
  int count = 0;
  for(int i = start; i < end; i++)
    if(i % 3 == 0)
      if(i % 5 == 0)
        bizzfuzz[count++] = "FizzBuzz";
      else
        bizzfuzz[count++] = "Fizz";
    else if(i % 5 == 0)
      bizzfuzz[count++] = "Buzz";
    else
      bizzfuzz[count++] = String.valueOf(i);
  return bizzfuzz;
}
