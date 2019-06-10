public String getSandwich(String str) {
  if(str.indexOf("bread") == str.lastIndexOf("bread")) return "";
  return str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
}
