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
	public static StringBuilder sb = new StringBuilder();
	public static int [] count = new int[3];
	public static int arr [][];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
			}
		}
		partition(0,0,n);
		
		for(int a : count) {
			System.out.println(a);
		}
	}
	public static void partition(int row, int col, int size) {
		if(check(row,col,size)) {
			count[arr[row][col]+1]++;
			return;
		}
				
		partition(row, col, size/3);
		partition(row, col + size/3, size/3);
		partition(row, col + size/3 * 2 , size/3);
		partition(row + size/3, col , size/3);
		partition(row + size/3, col + size/3, size/3);
		partition(row + size/3, col + size/3 * 2, size/3);
		partition(row + size/3 * 2, col, size/3);
		partition(row + size/3 * 2, col + size/3, size/3);
		partition(row + size/3 * 2, col + size/3 * 2, size/3);	
	}
	public static boolean check(int row, int col, int size) {
		int start = arr[row][col];
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (start != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
