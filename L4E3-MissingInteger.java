// Correctness =	100% 	
// Performance =	75%
// Points = 		88% 

public int solution(int[] A) {
	int l = A.length;
	if(l == 1){
		return (A[0] == 1) ? 2 : 1;
	}
	
	int[] c = new int[l];
	for (int i = 0; i < A.length; i++) {
		if(A[i] > 0 && A[i] < l){
			c[ A[i] - 1] =  1;
		}
	}
	for (int i = 0; i < c.length; i++) {
		if( c[i] == 0) return i+1;
	}
	return l + 1;
}