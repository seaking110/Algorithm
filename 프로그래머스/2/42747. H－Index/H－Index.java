import java.util.*;
class Solution {
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        // 0 1 3 5 6
        for (int i = citations[citations.length-1]; i >=0 ; i--) {
        	int up = 0;
        	int down = 0;
        	for (int j = 0; j < citations.length; j++) {
        		if (i <= citations[j]) {
        			up++;
        		}
        		else {
        			down++;
        		}
        	}
        	if ( i <= up && down <= i) {
        		return i;
        	}
        }
        return answer;
    }
}