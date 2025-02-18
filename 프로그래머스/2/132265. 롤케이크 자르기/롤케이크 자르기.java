import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        answer = dfs(topping);
        
        return answer;
    }
    public static int dfs(int[] topping) {
    	Map <Integer, Integer> left = new HashMap<>();
    	Map <Integer, Integer> right = new HashMap<>();
    	int count = 0;
    	left.put(topping[0], 1);
    	for (int i = 1; i < topping.length; i++) {
    		right.put(topping[i], right.getOrDefault(topping[i], 0)+1);
    	}
    	if (left.size() == right.size()) {
    		count++;
    	}
    	for (int i = 1; i < topping.length-1; i++) {
    		left.put(topping[i], left.getOrDefault(topping[i], 0)+1);
    		right.put(topping[i], right.get(topping[i])-1);
    		if (right.get(topping[i])== 0) {
    			right.remove(topping[i]);
    		}
    		if (left.size() == right.size()) {
        		count++;
        	}
    	}
    	return count;
    }
}