//80%
public static int solution1(int N) {
	String br = Integer.toBinaryString(N);
	String[] bits = br.split("1");
	int maxGap = 0;
	int l = 0;
	for(String s : bits ){
		l = s.length();
		if(l > maxGap){
			maxGap = l;
		}
	}
	return maxGap;
}