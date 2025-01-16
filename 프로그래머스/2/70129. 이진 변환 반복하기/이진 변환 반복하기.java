class Solution {
	public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int length = 0;
        while (true) {
        	int len = s.length();
        	s = s.replace("0", "");
        	count++;
        	length += len - s.length();
        	s = Integer.toString(s.length(), 2);
        	if (s.equals("1")) {
        		break;
        	}
        }
        answer [0] = count;
        answer [1] = length;
        return answer;
    }
}