public int commonTwo(String[] a, String[] b) {
<<<<<<< HEAD
  String coolcat = Arrays.toString(a).replaceAll("[^a-zA-Z0-9]",""), count = "0";
  for(String i : b) if(coolcat.length() != (coolcat = coolcat.replaceAll("["+i+"]","")).length()) count = "" + (Integer.parseInt(count) + 1);
  return Integer.parseInt(count);
}
// Done this way to save lines for a little competition
=======
  int count = 0;
  String coolcat = Arrays.toString(a).replaceAll("[^a-zA-Z0-9]","");
  for(String i : b) {
    int temp = coolcat.length();
    coolcat = coolcat.replaceAll("[" + i + "]","");
    if(coolcat.length()!=temp) count++;
  }
  return count;
}
>>>>>>> parent of 2b2abe4... fun
