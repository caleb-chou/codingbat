public boolean endOther(String a, String b) {
	String t1 = a.toLowerCase(),t2=b.toLowerCase();
	return (t1.length()>=t2.length()) ? t1.substring(t1.length()-t2.length()).equals(t2):t2.substring(t2.length()-t1.length()).equals(t1);
}
