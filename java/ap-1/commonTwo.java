public int commonTwo(String[] a, String[] b) {
  int count = 0;
  String coolcat = Arrays.toString(a).replaceAll("[^a-zA-Z0-9]","");
  for(String i : b) {
    int temp = coolcat.length();
    coolcat = coolcat.replaceAll("[" + i + "]","");
    if(coolcat.length()!=temp) count++;
  }
  return count;
}
