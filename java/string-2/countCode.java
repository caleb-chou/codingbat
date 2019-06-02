public int countCode(String str) {
	int count = 0;
	String temp = str.toLowerCase();
	if(temp.isEmpty()||temp.length()<4) return 0;
	for(int i=0;i<temp.length()-3;i++) if(temp.substring(i,i+2).equals("co")&&temp.charAt(i+3)=='e') count++;
	return count;
}