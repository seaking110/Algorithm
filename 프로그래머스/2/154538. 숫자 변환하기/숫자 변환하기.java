import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = bfs(x,y,n, 0);

        return answer;
    }
    public static int bfs(int x, int y, int n, int count) {
    	Queue <Node> q = new LinkedList<>();
    	q.add(new Node(y, count));
    	while(!q.isEmpty()) {
    		Node node = q.poll();
    		y = node.y;	
    		if (x == y) {
    			return node.count;
    		} else {
    			if (y % 3 == 0 && y / 3 >= x) {
    				q.add(new Node(y / 3, node.count+1));
    			}
    			if (y % 2 == 0 && y / 2 >= x) {
    				q.add(new Node(y / 2, node.count+1));
    			}
    			if (y - n >= x) {
    				q.add(new Node(y - n, node.count+1));
    			}
    		}
    	}
    	return -1;
    }

    public static class Node {
    	private int y;
    	private int count;
    	public Node(int y, int count) {
    		this.y = y;
    		this.count = count;
    	}
    }
}