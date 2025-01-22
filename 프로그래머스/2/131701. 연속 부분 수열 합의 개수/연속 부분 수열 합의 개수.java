import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set <Integer> set = new HashSet<>(); 
        for (int i = 1; i <= elements.length; i++) {
        	for (int start = 0; start < elements.length; start++) {
        		int sum = 0;
        		for (int j = 0; j< i; j++) {
        			sum += elements[(start + j) % elements.length];
        		}
        		set.add(sum);
        	}
        	
        }
        return set.size();
    }
}