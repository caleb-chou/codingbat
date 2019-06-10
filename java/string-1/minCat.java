public String minCat(String a, String b) {
  if(a.length() == b.length())
    return a + b;
  if(a.length() > b.length()) {
    return a.substring(b.length(), a.length()) + b;
  } else {
    return a + b.substring(a.length(), b.length());
  }
}
