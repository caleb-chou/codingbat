public int wordsCount(String[] words, int len) {
  int count = 0;
<<<<<<< HEAD
  for(String s : words) if (s.length() == len) count++;
=======
  
  for(int i = 0; i < words.length; i++) {
    if(words[i].length() == len) count++;
  }
>>>>>>> 459d0a99f5ab8c4136ff37575a5f1bed00541edd
  return count;
}
