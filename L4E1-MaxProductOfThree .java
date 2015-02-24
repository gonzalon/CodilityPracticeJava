/*
Score: 100%
*/
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
		Arrays.sort(A);
		int N = A.length;
		int pos  = A[N-1]*A[N-2]*A[N-3];
		int neg = A[0]*A[1]*A[N-1];
		return (pos > neg) ? pos : neg;
    }
}