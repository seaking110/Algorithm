class Solution {
    	public  int solution(int[] arr) {
        int answer = arr[0];
        int sum = arr[0];
        for (int i = 1; i<arr.length;i++) {
        	answer = gcd(sum, arr[i]);
        	sum *= arr[i] / answer;
        }
        return sum;
	}
	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		int r = a % b;
		a = b;
		b = r;
		return gcd(a,b);
	}
}