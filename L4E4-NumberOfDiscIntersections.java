/*
Source:
1- http://www.lucainvernizzi.net/blog/2014/11/21/codility-beta-challenge-number-of-disc-intersections/
Score: 75%
Errors:
* overflow (arithmetic overflow tests) 	1.024 s 	WRONG ANSWER  - got 1 expected 2
* big1 									>8.000 s 	TIMEOUT ERROR - running time: >8.00 sec., time limit: 2.74 sec.
* big2 									>8.000 s 	TIMEOUT ERROR - running time: >8.00 sec., time limit: 2.87 sec.
* big3 [0]*50000					 	>8.000 s 	TIMEOUT ERROR - running time: >8.00 sec., time limit: 2.65 sec.
*/
class Solution {
    public int solution(int[] A) {
		int[][] d = new int[A.length][2];

		for (int i = 0; i < A.length; i++) {
			d[i][0] = i - A[i];
			d[i][1] = i + A[i];
		}

		/*for (int i = 0; i < d.length; i++) {
			System.out.println(Arrays.toString(d[i]));
		}*/
		
		int end, start, count = 0;
		for(int j = 0; j < A.length; j++){
			end = d[j][1];
			for(int k = j+1; k < A.length; k++){
				start = d[k][0];
				if(end >= start){
					//System.out.println(Arrays.toString(d[j]) + " " + Arrays.toString(d[k]));
					count++;
				}
			}	
		}
		//System.out.println(count);
		return count; 
	}
}