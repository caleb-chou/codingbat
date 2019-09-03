public String withoutString(String base, String remove) {
  return base.replaceAll(remove + "|" + remove.toLowerCase() + "|" + remove.toUpperCase(),"");
}
