public boolean xyBalance(String str) {
  int counter = 0;
  for(char c:str.toCharArray()) {
    if(c=='x') counter++;
    if(c=='y') counter=0;
  }
  return counter==0;
}
