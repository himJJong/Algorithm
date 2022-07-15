package algorithm;

import java.util.*;
import java.io.*;

public class plus {
		static int data;
		static int depth;
		static int[] dataarr;
		static int[] arr;
		static StringBuilder sb;
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		data = Integer.parseInt(st.nextToken());
		depth = Integer.parseInt(st.nextToken());
		dataarr = new int[data];
		arr = new int[depth];
		sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<data;i++) {
			dataarr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(dataarr);
		dfs(0);
		System.out.println(sb);
	}
	
	public static void dfs(int limit) {
		if(depth==limit) {
			for(int i : arr) {
				sb.append(i+ " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<data ;i++) {
			arr[limit] = dataarr[i];
			dfs(limit+1);
		}
	}
}
