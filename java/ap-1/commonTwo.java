public int commonTwo(String[] a, String[] b) {
  int count = 0;

  for(int i = 0; i < a.length; i++) {
    for(int j = 0; j < b.length; j++) {
        if(!Arrays.toString(a).substring(0, i * 3).contains(a[i]) && a[i].equals(b[j])) {
          count++;
          break;
        }
    }
 }
  return count;
}

/*
public int commonTwo(String[] a, String[] b) {
  String coolcat = Arrays.toString(a).replaceAll("[^a-zA-Z0-9]",""), count = "0";
  for(String i : b) if(coolcat.length() != (coolcat = coolcat.replaceAll("["+i+"]","")).length()) count = "" + (Integer.parseInt(count) + 1);
  return Integer.parseInt(count);
}
*/
