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
/*
public int commonTwo(String[] a, String[] b) {
    HashSet<String> kaleb = new HashSet<String>(Arrays.asList(a));
    HashSet<String> output = new HashSet<String>();
    for (String str : b) if (kaleb.contains(str)) output.add(str);
    return output.size();
}
*/
