import java.util.Arrays;
//Score 93%
class Solution {
    public int solution(int[] A) {
		int N = A.length;
		if(N < 3) return 0;
		
		Arrays.sort(A);
		int P, Q, R;
		for(int i = 0; i < N-2; i++){
			P = A[i];
			Q = A[i+1];
			R = A[i+2];
			if(P+Q>R && Q+R>P && R+P>Q){
				return 1;
			}
		}
		return 0;
    }
}