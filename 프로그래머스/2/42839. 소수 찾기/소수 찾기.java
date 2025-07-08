import java.util.HashSet;
import java.util.Set;

class Solution {
	public static boolean[] visited; 
	public static char[] numberChars;
	public static Set<Integer> s = new HashSet<>(); 
    public int solution(String numbers) {
   int answer = 0;
        numberChars = numbers.toCharArray();
        visited = new boolean[numberChars.length];
        permute("", 0); 
        for (Integer i : s) {
        	if(check(i)) {
        		answer++;
        	}
        }
        return answer;	
    }
 private static void permute(String currentPermutation, int depth) {
        if (!currentPermutation.isEmpty()) {
            s.add(Integer.parseInt(currentPermutation));
        }

        for (int i = 0; i < numberChars.length; i++) {
            if (!visited[i]) { // 아직 사용하지 않은 숫자라면
                visited[i] = true; // 사용했다고 표시
                permute(currentPermutation + numberChars[i], depth + 1);
                visited[i] = false; // 백트래킹: 다음 조합을 위해 사용 표시를 해제
            }
        }
    }
    public static boolean check(int a) {
    	if (a == 1 || a == 0) {
    		return false;
    	} else {
    		for (int i = 2; i <= Math.sqrt(a); i++) {
    			if (a % i == 0) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}