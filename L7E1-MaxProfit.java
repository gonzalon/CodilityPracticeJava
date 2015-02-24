/*
Sources:
1- https://codility.com/media/train/7-MaxSlice.pdf
2- http://rafal.io/posts/codility-max-profit.html
3- http://en.wikipedia.org/wiki/Maximum_subarray_problem
Score: 100%
*/
class Solution {
    public int solution(int[] A) {
  		if(A == null || A.length < 2) return 0;
	    int maxSoFar = 0;
	    int maxEndingHere = 0;
	    int minPrice = A[0];
		for (int i = 1; i < A.length; i++) {
	        maxEndingHere = Math.max(0, A[i] - minPrice);
	        minPrice = Math.min(minPrice, A[i]);
	        maxSoFar = Math.max(maxEndingHere, maxSoFar);
	    }
		return maxSoFar;
    }
}