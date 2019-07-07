public boolean gHappy(String str) {
  return str.replaceAll("g{2,}","").indexOf("g") == -1;
}
