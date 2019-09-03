public boolean sameStarChar(String str) {
  for(int i = 0; i < str.length(); i++) {
    if(i != 0 && i != str.length() - 1) {
      if(str.substring(i, i+1).equals("*")) {
        if(!str.substring(i-1, i).equals(str.substring(i+1, i+2))) return false;
      }
    } 
  }
  return true;
}
