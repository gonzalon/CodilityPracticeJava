import java.util.Arrays;
// Score 100%
class Solution {
    public int solution(int[] A) {
        return (int)Arrays.stream(A).distinct().count();
    }
}