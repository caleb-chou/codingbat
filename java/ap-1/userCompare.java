public int userCompare(String aName, int aId, String bName, int bId) {
   if(!aName.equals(bName)) {
     return (aName.compareTo(bName) > 0) ? 1 : -1;
   } else {
     if(aId == bId) return 0;
     return (aId > bId) ? 1 : -1;
   }
}
