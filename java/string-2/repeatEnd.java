public String repeatEnd(String str, int n) {
  String temp = "";
  for(int i= 0;i<n;i++) temp+=str.substring(str.length()-n);
  return temp;
}
