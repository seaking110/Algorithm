class Solution {
    	public static int result = 0;
    	public  int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return result;
    }
	public static void dfs(int[] numbers, int target, int sum, int start) {
		if (start == numbers.length) {
			if (sum == target) {
				result++;
			}			
			return;
		}	
		dfs(numbers, target, sum + numbers[start], start+1);
		dfs(numbers, target, sum - numbers[start], start+1);
		
	}
}