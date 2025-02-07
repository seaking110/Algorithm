import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String s =	Integer.toString(n, k);
        StringTokenizer st = new StringTokenizer(s,"0");
        while(st.hasMoreTokens()) {
        	long l = Long.parseLong(st.nextToken());
        	System.out.println(l);
        	if (decimal(l)) {
        		answer++;
        	}
        	
        }
        return answer;
    }
    public static boolean decimal(long x) {
    	if (x == 1) {
    		return false;
    	}
    	for (int i = 2; i <= Math.sqrt(x); i++) {
    		if (x % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}