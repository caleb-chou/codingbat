public List wordsWithoutList(String[] words, int len) {
  List a = new ArrayList();
  for(String s : words) if(s.length() != len) a.add(s);
  return a;
}
