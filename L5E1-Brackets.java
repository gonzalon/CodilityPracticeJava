import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
//Score 100%
class Solution {
    public int solution(String S) {
        		if(S==null || S.length() == 0) return 1;
		Stack<Character> stackOpen = new Stack<Character>();
		ArrayList<Character> open = new ArrayList<Character>(Arrays.asList('{', '(', '['));
		ArrayList<Character> close = new ArrayList<Character>(Arrays.asList('}', ')', ']'));
		char c;
		for(int i = 0; i < S.length(); i++){
			c = S.charAt(i);
			if(close.contains(c) && stackOpen.empty()){
				return 0;
			}
			if(open.contains(c)){
				stackOpen.push(c);
			}
			if(close.contains(c)){
				char opening = stackOpen.peek();
				if(opening == '(' && c == ')' || opening == '{' && c == '}' || opening == '[' && c == ']'){
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