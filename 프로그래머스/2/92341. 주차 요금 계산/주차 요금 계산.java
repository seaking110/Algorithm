import java.util.*;
class Solution {
        public static int[] solution(int[] fees, String[] records) {
        int baseTime = fees[0];
        int baseFare = fees[1];
        int unitTime = fees[2];
        int unitFare = fees[3];
        Map<String, Node> m = new LinkedHashMap<>();
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < records.length; i++) {
        	StringTokenizer st = new StringTokenizer(records[i]);
        	String time = st.nextToken();
        	String carNum = st.nextToken();
        	String inOut = st.nextToken();
        	if (inOut.equals("IN")) {
        		m.put(carNum, new Node(time,inOut));
        	} else {
        		Node n = m.remove(carNum);
        		st = new StringTokenizer(n.time,":");
        		StringTokenizer st2 = new StringTokenizer(time,":");
        		int hh = Integer.parseInt(st2.nextToken()) - Integer.parseInt(st.nextToken());
        		int mm = Integer.parseInt(st2.nextToken()) - Integer.parseInt(st.nextToken());
        		map.put(carNum, map.getOrDefault(carNum, 0) + (hh * 60) + mm);
        		
        	}
        	
        }
        if (!m.isEmpty()) {
        	for (Map.Entry<String, Node> s : m.entrySet()) {
        		String carNum = s.getKey();
        		String time = s.getValue().time;
        		StringTokenizer st = new StringTokenizer(time,":");
        		int hh = 23 - Integer.parseInt(st.nextToken());
        		int mm = 59 - Integer.parseInt(st.nextToken());
        		map.put(carNum, map.getOrDefault(carNum, 0) + (hh * 60) + mm);
        	}
        }
        ArrayList <Integer> arr = new ArrayList<>();
        for (int min: map.values()) {
        	if (min <= baseTime) {
        		arr.add(baseFare);
        	} else {
        		arr.add(baseFare + (int)Math.ceil((double)(min - baseTime) / unitTime) * unitFare);
        	}
        	
        }
        int [] answer = new int[arr.size()];
        for (int i = 0 ; i <arr.size();i++) {
        	answer[i] = arr.get(i);
        	System.out.println(answer[i]);
        }
        return answer;
    }
    static class Node {
    	private String time;
    	private String inOut;
    	Node(String time, String inOut){
    		this.time = time;
    		this.inOut = inOut;
    	}
    }
}