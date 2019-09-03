public String fizzString2(int n) {
  String ugh = "";
  if(n % 3 == 0) ugh += "Fizz";
  if(n % 5 == 0) ugh += "Buzz";
  if(ugh.length()==0) ugh += n;
  return ugh +"!";
}
