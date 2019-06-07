public String repeatSeparator(String word, String sep, int count) {
  String s = "";
  for(int i = 0; i < count; i++) {
    s+=word;
    if(i<count-1) s+= sep;
  }
  return s;
}
