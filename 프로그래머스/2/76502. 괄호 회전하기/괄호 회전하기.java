import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i=0;i<s.length();i++) {
            char first = s.charAt(0);
            s = s.substring(1)+first;
            if (check(s)) {
            	answer++;
            }
        }

        return answer;
    }
    public boolean check(String s) {
        Stack <Character> stack = new Stack<>();
        int count = 0;
        while (count < s.length()) {
        	if (s.charAt(count)==']') {
        		if (!stack.isEmpty() && stack.pop()=='[') {
        			count++;
        		} else {
        			return false;
        		}
        	} else if (s.charAt(count)==')') {
        		if (!stack.isEmpty() && stack.pop()=='(') {
        			count++;
        		} else {
        			return false;
        		}
        	} else if (!stack.isEmpty() && s.charAt(count)=='}') {
        		if (stack.pop()=='{') {
        			count++;
        		} else {
        			return false;
        		}
        	} else {
        		stack.add(s.charAt(count));
        		count++;
        	}
        }
        if (stack.isEmpty()) {
            return true;
        } 
        return false;
    }
}