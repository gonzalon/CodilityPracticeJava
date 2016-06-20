//Correctness 	100%
//Performance 	60% 	
//Task score 	77% 

 public int[] solution(int N, int[] A) {
	int max = 0;
	int[] c = new int[N];
	for(int K = 0; K < A.length; K++){
		//if A[K] = N + 1 then operation K is max counter.
		if(A[K] == N+1){
			
			for(int i = 0; i < c.length; i++){
				c[i] = max;
			}
			//System.out.println(A[K] + " * " + Arrays.toString(c));
		}else{
			//if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
			if(A[K] > 0 && A[K] <= N){
				c[ A[K]-1 ] = c[ A[K] - 1] + 1;
				if(max < c[ A[K]-1 ]){
					max = c[ A[K]-1 ];
				}
				//System.out.println(A[K] + " - " + Arrays.toString(c));
			}
		}
	}
	return c;
}