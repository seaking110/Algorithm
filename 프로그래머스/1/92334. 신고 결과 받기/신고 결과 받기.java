import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
    	int [] answer = new int[id_list.length]; 
    	int [] result = new int[id_list.length]; 
    	Set <String> set = new HashSet<>(); 
    	for (int i = 0; i < report.length; i++) {
    		set.add(report[i]);
    	}
    	String [] s = set.toArray(new String[0]);
    	for (int i = 0; i < s.length; i++) {
    		StringTokenizer st = new StringTokenizer(s[i]);
    		st.nextToken();
    		String name = st.nextToken();
    		for (int j = 0; j < id_list.length; j++) {
    			if (id_list[j].equals(name)) {
    				answer[j]++;
    				break;
    			}
    		}
    	}
    	for (int i = 0; i < s.length; i++) {
    		StringTokenizer st = new StringTokenizer(s[i]);
    		String name1 = st.nextToken();
    		String name2 = st.nextToken();
    		for (int j = 0; j < id_list.length; j++) {
    			if (id_list[j].equals(name2)) {
    				if (answer[j] >= k) {
    				for(int l = 0; l < id_list.length; l++) {
    					if (id_list[l].equals(name1)) {
    						result[l]++;
    						break;
    					}
    				}
    				}
    			}
    		}
    	}
    	
    	return result;
    }
}