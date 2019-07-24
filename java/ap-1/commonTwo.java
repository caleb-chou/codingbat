public int commonTwo(String[] a, String[] b) {
  int count = 0;

  for(int i = 0; i < a.length; i++) {
    for(int j = 0; j < b.length; j++) {
        if(!Arrays.toString(a).substring(0, i * 3).contains(a[i]) 
        && a[i].equals(b[j])) {
          count++;
          break;
        }
    }
 }
  return count;
}
