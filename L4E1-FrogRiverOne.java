//100%
public int solution(int X, int[] A) {
	if(A.length == 1){
		if(A[0] == X) return 0;
		if(A[0] != X) return -1;
	}
	int[] c = new int[A.length+1];
	int q = 0;
	for (int i = 0; i < A.length; i++) {
		if(c[A[i]] == 0){
			c[A[i]] = 1;
			q++;
		}
		if(X == q){
			return i;
		}
	}
	return -1;
}