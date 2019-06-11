public String plusOut(String str, String word) {
  return str.replace(word," ").replaceAll("[^\\s]","+").replace(" ",word);
}
