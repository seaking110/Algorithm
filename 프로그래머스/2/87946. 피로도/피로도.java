

class Solution {
    public static int max = Integer.MIN_VALUE;
    public static boolean visited[];
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(dungeons, 0, k);
        return max;
    }
    public static void dfs(int[][] dungeons, int count, int k) {
        max = Math.max(max, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) { // 방문하지 않았고, 최소 피로도 충족할 경우
                visited[i] = true;
                dfs(dungeons, count + 1, k - dungeons[i][1]); // 탐험 후 피로도 감소
                visited[i] = false; // 백트래킹 (다음 경우의 수 탐색)
            }
        }
    }
}