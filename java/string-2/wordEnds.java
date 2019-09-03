public String wordEnds(String str, String word) {
  String temp = "";
  for(int i=0;i<str.length()+1-word.length();i++) {
    if(str.substring(i,i+word.length()).equals(word)) {
      temp+= 
      (i==0) ? ((i!=str.length()-word.length()) ? str.charAt(i+word.length()) : "")
      : ((i!=str.length()-word.length()) ? (""+str.charAt(i-1))+(""+str.charAt(i+word.length()))
      : (""+str.charAt(i-1)));
    }
  }
  return temp;
}
