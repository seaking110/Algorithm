import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length ; i++) {
        	map.put(want[i],number[i]);
        }
        
        for (int i = 0; i < discount.length - 10 + 1; i++) {
        	Map<String, Integer> newMap = new HashMap<>();
        	for (int j = i; j < i+10; j++) {
        		newMap.put(discount[j], newMap.getOrDefault(discount[j], 0)+1);
        	}
        	
            Boolean isIdentical = true;
            
            for(String key : map.keySet()){
                if(map.get(key) != newMap.get(key)){
                    isIdentical = false;
                    break;
                }
            }
            if (isIdentical) {
            	answer++;
            }
        }
        return answer;
    }
}