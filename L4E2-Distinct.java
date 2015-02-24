/*
Score: 100%
*/
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        return (int)Arrays.stream(A).distinct().count();
    }
}