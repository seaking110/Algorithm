
import java.util.*;
class Solution {
    public static Map <String, Integer> m = new HashMap<>();
    public  String[] solution(String[] players, String[] callings) {
    	for (int i = 0; i < players.length; i++) {
    		m.put(players[i],i);
    	}
    	for (String s : callings) {
    		int a = m.get(s).intValue();
    		int b = a - 1;
    		players[a] = players[b];
    		players[b] = s;
    		
    		m.put(s, b);
    		m.put(players[a], a);
    	}

        return players;
    }
}