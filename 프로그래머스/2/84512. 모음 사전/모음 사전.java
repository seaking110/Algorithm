import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int solution(String word) {
        int answer = 1;
        List <String> list = new LinkedList<>();
        dfs(list, 0, "");
        Collections.sort(list);
        for (String s : list) {
        	if (s.equals(word)) {
        		return answer;
        	}
        	answer++;
        }
        return -1;
    }
  public static void dfs(List<String> list, int depth, String word) {
    	if (depth == 5) {
    		return;
    	}
    	list.add(word+"A");
    	dfs(list, depth+1, word+"A");
    	list.add(word+"E");
    	dfs(list, depth+1, word+"E");
    	list.add(word+"I");
    	dfs(list, depth+1, word+"I");
    	list.add(word+"O");
    	dfs(list, depth+1, word+"O");
    	list.add(word+"U");
    	dfs(list, depth+1, word+"U");
    }
}