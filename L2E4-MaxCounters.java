//Score 100%
class Solution {
    public int[] solution(int N, int[] A) {
		int[] res = new int[N];
		int max = -1;
		int current_min = -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == N + 1){
				current_min = max;
			}else{
				if(res[A[i]-1] < current_min) res[A[i]-1] = current_min;
				res[A[i]-1]++;
				if(res[A[i]-1] > max) max = res[A[i]-1];
			}
		}
		for (int i = 0; i < res.length; i++) {
			if(res[i] < current_min) res[i] = current_min;
		}
		return res;
    }
}