import java.util.*;
class Solution {
     public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= order.length; i++) {
            q.add(i);
        }
        int count = 0;

        while (!q.isEmpty() || !stack.isEmpty()) {
            if (!q.isEmpty() && q.peek() == order[count]) {
                q.poll();
                answer++;
                count++;
            }
            else if (!stack.isEmpty() && stack.peek() == order[count]) {
                stack.pop();
                answer++;
                count++;
            }
            else {
                if (!q.isEmpty()) {
                    stack.push(q.poll());
                } else {
                    break;
                }
            }
        }

        return answer;
    }
}