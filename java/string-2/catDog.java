public boolean catDog(String str) {
  int numc=0,numd=0;
  for(int i =0;i<str.length()-2;i++) if(str.substring(i,i+3).equals("cat")) numc++; else if(str.substring(i,i+3).equals("dog")) numd++;
  return numc==numd;
}
