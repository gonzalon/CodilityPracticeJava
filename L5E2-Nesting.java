import java.util.Stack;
//Score 100%
class Solution {
    public int solution(String S) {
        		if(S==null || S.length() == 0) return 1;
		Stack<Character> stackOpen = new Stack<Character>();
		char open = '(';
		char close = ')';
		char c;
		for(int i = 0; i < S.length(); i++){
			c = S.charAt(i);
			if(c == close && stackOpen.empty()){
				return 0;
			}
			if(open == c){
				stackOpen.push(c);
			}
			if(close == c){
				if(stackOpen.peek() == '(' && c == ')'){
					stackOpen.pop();
				}else{
					return 0;
				}
			}
		}
		if(stackOpen.isEmpty()) return 1;
		return 0;
    }
}