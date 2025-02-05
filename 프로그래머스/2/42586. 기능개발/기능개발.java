import java.util.*;
class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
        
        List <Integer> list = new ArrayList<>();
        Queue <Integer> q = new LinkedList<>();
        for (int i = 0; i< progresses.length; i++) {
        	q.add(((int)Math.ceil(((double)100 - progresses[i]) / speeds[i])));
        }
        while (!q.isEmpty()) {
        	int a = q.poll();
        	int count = 1;
        	while (!q.isEmpty() && q.peek() <= a) {
        		count++;
        		q.poll();
        	}
        	list.add(count);
        }
        int[] answer = new int[list.size()];
        int count = 0;
        for (int a : list) {
        	answer[count] = a;
        	System.out.println(a);
        	count++;

        }
        return answer;
    }
}