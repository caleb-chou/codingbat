public String[] wordsWithout(String[] words, String target) {
  int ct = 0, index = 0;
  
  for(String str : words) {
    if(str.equals(target)) ct++;
  }
  
  String[] output = new String[words.length - ct];

  for(int i = 0; i < words.length; i++) {
    if(!words[i].equals(target)) {
      output[index] = words[i];
      index++;
    }
  }
  return output;
}
