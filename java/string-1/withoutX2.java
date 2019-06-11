public String withoutX2(String str) {
  if(str.length() < 2) return "";
  String start = str.substring(0, 2);
  if(start.substring(1, 2).equals("x")) start = start.substring(0, 1);
  if(start.substring(0, 1).equals("x")) start = start.substring(1);
  return start + str.substring(2);
}
