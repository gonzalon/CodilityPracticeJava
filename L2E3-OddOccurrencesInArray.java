//100%
public static int solution(int[] A) {
	int r = A[0];
	for(int i = 1; i < A.length; i++){
		System.out.println(r + " ^ " + A[i] + " = " + (r ^ A[i]));
		r = r ^ A[i];
	}
	return r;
}