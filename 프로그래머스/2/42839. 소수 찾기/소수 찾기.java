import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> numSet = new HashSet<>();
        permute(numSet, "" , numbers);
        for (int i : numSet) {
        	if (check(i)) {
        		answer++;
        	}
        }
        return answer;
    }
    
    public static boolean check(int a) {
    	if (a== 0 || a == 1) {
    		return false;
    	}
    	for (int i = 2; i <= Math.sqrt(a); i++) {
    		if (a % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static void permute(Set<Integer> set, String pre, String numbers) {
    	if (!pre.isEmpty()) {
    		set.add(Integer.parseInt(pre));
    	}
    	for (int i = 0 ; i< numbers.length(); i++) {
    		permute(set, pre+numbers.charAt(i), numbers.substring(0,i)+ numbers.substring(i+1));
    	}
    }
}