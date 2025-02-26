import java.util.*;
class Solution {
   	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue <Integer> q = new LinkedList<>();
        for(int i=0; i< bridge_length-1; i++) {
        	q.add(0);
        }
        int count = 0;
        q.add(truck_weights[count++]);
        int sum = truck_weights[0];
        answer++;
        while(true) {
            if (count == truck_weights.length) {
        		answer += bridge_length;
        		break;
        	}
        	sum -= q.poll();
        	if (sum + truck_weights[count] <= weight) {
        		q.add(truck_weights[count]);
        		sum += truck_weights[count++];
        	} else {
        		q.add(0);
        	}
        	answer++;
        }
        
        return answer;
    }
}