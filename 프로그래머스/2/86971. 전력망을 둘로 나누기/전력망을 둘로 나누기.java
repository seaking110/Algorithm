import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int n, int[][] wires) {
           int answer = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < wires.length; i++) {
        	Set <Integer> s = new HashSet<>(); 
            int a = wires[i][0];
            check(a, s, wires, i);
            int abs = Math.abs(n - s.size() - s.size());
            min = Math.min(min, abs);
        }

        
        return min;
    }
    public void check(int a, Set<Integer> s, int[][] wires, int n) {
    	if (s.contains(a)) {
    		return;
    	}
    	s.add(a);
    	for (int i = 0; i < wires.length;i++) {
    		if (i != n) {
    			if (wires[i][0] == a) {
    				check(wires[i][1], s, wires, n);
    			} else if (wires[i][1] == a) {
    				check(wires[i][0], s, wires, n);
    			}
    		}
    	}
    }
}