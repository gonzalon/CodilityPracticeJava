/*
Source:
1- http://en.wikipedia.org/wiki/Maximum_subarray_problem
Score: 100%
*/
class Solution {
    public int solution(int[] A) {
		int max = A[0];
	    int maxSlice =  A[0];
		for (int i = 1; i < A.length; i++) {
			max = Math.max(max + A[i], A[i]);
			maxSlice = Math.max(max, maxSlice);
	    }
	    return maxSlice;
    }
}