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
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	public static int n;
	public static int arr[];
	public static int op[];

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bf.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		op = new int[4];
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < 4; i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0, arr[0]);
		System.out.println(max + " " + min);
	}

	public static void dfs(int dep, int sum) {

		if (dep == n - 1) {
			max = Math.max(max, sum);
			min = Math.min(min, sum);
			return;
		}
		for (int j = 0; j < 4; j++) {
			if (op[j] > 0) {
				int result = sum;
				op[j]--;
				if (j == 0) {
					result += arr[dep + 1];
				} else if (j == 1) {
					result -= arr[dep + 1];
				} else if (j == 2) {
					result *= arr[dep + 1];
				} else {
					result /= arr[dep + 1];
				}
				dfs(dep + 1, result);
				op[j]++;
			}

		}
	}
}
