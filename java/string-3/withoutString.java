public String withoutString(String base, String remove) {
  String str = "";
  for(int i = 0; i < base.length() - remove.length(); i++) {
    if(base.toLowerCase().substring(i, i + remove.length()).equals(remove.toLowerCase())) {
      i += remove.length() - 1;
    } else {
      str += base.substring(i, i+1);
    }
  }
  if(base.toLowerCase().substring(base.length() - remove.length(), base.length()).equals(remove.toLowerCase()))
  
  
  
    return str;
 return str + base.substring(base.length() - remove.length(), base.length());
}
