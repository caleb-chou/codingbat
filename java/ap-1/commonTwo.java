public int commonTwo(String[] a, String[] b) {
  String coolcat = Arrays.toString(a).replaceAll("[^a-zA-Z0-9]",""), count = "0";
  for(String i : b) if(coolcat.length() != (coolcat = coolcat.replaceAll("["+i+"]","")).length()) count = "" + (Integer.parseInt(count) + 1);
  return Integer.parseInt(count);
}
// Done this way to save lines for a little competition