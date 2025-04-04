import java.util.*;
class Solution {
        public static int solution(int[] order) {
    	int idx = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < order.length; i++){
            stack.push(i+1);
            while(!stack.isEmpty()){
                if (stack.peek() == order[idx]){
                    stack.pop();
                    idx++;
                } else break;
            }
        }

        return idx;
    }
}