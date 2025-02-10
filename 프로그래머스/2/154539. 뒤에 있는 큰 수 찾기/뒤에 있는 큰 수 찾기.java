import java.util.*;
class Solution {
    public int[] solution(int [] numbers) {
    	int [] answer = new int[numbers.length];
    	int length = numbers.length -1;
    	answer[length--] = -1;
    	Stack <Integer> s = new Stack<>();
    	for (int i = length; i >=0; i--) {
    		if (numbers[i+1]> numbers[i]) {
    			s.push(numbers[i+1]);
        		answer[length--] = numbers[i+1];
        		continue;
    		}  else {
    			boolean flag = false;
    			while (!s.isEmpty()) {
    				int now = s.peek();
    				if (now > numbers[i]) {
    					flag = true;
    					answer[length--] = now;
    					break;
    				} else {
    					s.pop();
    				}
    			}
    			if (!flag) {
    				answer[length--] = -1;
    			}
    		}
    		
    	}
    	return answer;
    }
}