public boolean xyzMiddle(String str) {
  int counter = 0;
  if(str.length()<=4) return str.contains("xyz");
  if(str.substring((str.length()-3)/2,str.length()-(str.length()-3)/2).contains("xyz")) return true;
  return false;
}
