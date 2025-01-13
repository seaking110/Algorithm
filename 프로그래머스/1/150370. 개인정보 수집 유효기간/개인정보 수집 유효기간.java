import java.util.*;
class Solution {
     public int[] solution(String today, String[] terms, String[] privacies) {
    	List <Integer> list = new ArrayList<>();
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < terms.length; i++) {
        	StringTokenizer st = new StringTokenizer(terms[i]);
        	m.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }
    	StringTokenizer st2 = new StringTokenizer(today,".");
    	int todayYYYY = Integer.parseInt(st2.nextToken());
    	int todayMM = Integer.parseInt(st2.nextToken());
    	int todayDD = Integer.parseInt(st2.nextToken());
    	int todayNum = todayYYYY * 28 * 12 + todayMM * 28 + todayDD;
        for (int i = 0; i < privacies.length; i++) {
        	StringTokenizer st = new StringTokenizer(privacies[i],". ");
        	int yyyy = Integer.parseInt(st.nextToken());
        	int mm = Integer.parseInt(st.nextToken());
        	int dd = Integer.parseInt(st.nextToken());
        	String s = st.nextToken();
        	int addM = m.get(s);
        	if (mm + addM > 12) {
        		mm = mm + addM -12;
        		yyyy++;
        	} else {
        		mm += addM;
        	}
        	int num = yyyy * 28 * 12 + mm * 28 + dd;
        	if (num <= todayNum) {
        		list.add(i+1);
        	} 
        	
        }
        int [] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i); 
        	System.out.println(answer[i]);
        }
        return answer;
    }
}