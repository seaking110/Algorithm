import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static int min = Integer.MAX_VALUE;
	public static int [][] arr;
	public static int [] dp;
	public static int n;
	public static boolean [] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bf.readLine());
		arr = new int[n][n];
		visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0);
		System.out.println(min);
		
	}
	public static void dfs(int index, int dep) {
		if (dep == n / 2) {
			int link = 0;
			int start = 0;

	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (visited[i] && visited[j]) { // 같은 팀인 경우
	                    start += arr[i][j] + arr[j][i];
	                } else if (!visited[i] && !visited[j]) { // 다른 팀인 경우
	                    link += arr[i][j] + arr[j][i];
	                }
	            }
	        }
			min = Math.min(min, Math.abs(start-link));
			return;
		}
		for (int i = index; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(i,dep+1);
				visited[i] = false;
			}
		}
	}
}
