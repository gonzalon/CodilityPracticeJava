//100%
public static int[] solution(int[] A, int K) {
	// if the array have 0 or 1 element, or no shifting return the original.
	if( A.length < 2 || K == 0) return A;
	
	// if it have more shifts than elements it's the same to shift the diference
	if(K > A.length){
		K = K - A.length;
		return solution(A, K);
	}
		
	int[] shifted = new int[A.length];
	int pos = 0;
	for(int i = A.length-K; i < A.length; i++){
		shifted[pos] = A[i];
		pos++;
	}
	for(int j = 0; j < A.length-K; j++){
		shifted[pos] = A[j];
		pos++;
	}
		
	return shifted;
}