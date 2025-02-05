import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
                int answer = 0;
    	Queue<Node> q = new LinkedList<>();
    	for (int i = 0; i < priorities.length; i++) {
    		q.add(new Node(priorities[i], i));
    	}
    	while (true) {
    		int max = q.peek().priorities;
    		for (int i = 0; i < q.size(); i++) {
    			Node n = q.poll();
    			max = Math.max(max, n.priorities);
    			q.add(n);
    		}
    		while(q.peek().priorities != max) {
    			Node n = q.poll();
    			q.add(n);
    		}
    		Node n = q.poll();
    		answer++;
    		if (n.location == location) {
    			break; 
    		}
    	}
        return answer;
    }     
    static class Node {
    	int priorities;
    	int location;
    	
    	public Node(int priorities, int location){
    		this.priorities = priorities;
    		this.location = location;
    	}
    }
}