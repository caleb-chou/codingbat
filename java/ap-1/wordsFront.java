public String[] wordsFront(String[] words, int n) {
  String[] returnme = new String[n];
  for(int i = 0; i < n && i < words.length; i++) returnme[i] = words[i];
  return returnme;
}