//100%
public int solution(int[] A) {
			int e;
	int[] c = new int[A.length];
	for(int i = 0; i < A.length; i++){
		e = A[i];
		if(e < 1 || e > A.length) return 0;
		if(c[e-1] == 1) return 0;
		
		c[e-1] = 1;
	}
	return 1;
}