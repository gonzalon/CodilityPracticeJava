/*
Score: 88%
Errors: large_2 shuffled sequence 1, 2, ..., 100000 (without minus) 	1.272 s 	WRONG ANSWER got 5238 expected 100001
*/
class Solution {
    public int solution(int[] A) {
        		int L = A.length;
		int[] buf = new int[L+1];
		int pos = 0;
		for(int i = 0; i < L; i++){
			if(A[i] > 0 && A[i] < L+1){
				buf[A[i]] = A[i];
				pos++;
			}
		}
		if(pos == 0)  return 1;
		for(int i = 1; i < L; i++){
			if(buf[i] == 0) return i;
		}
		return A[L-1]+1;
    }
}