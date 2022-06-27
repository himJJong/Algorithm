package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int arr[][] = new int[cnt][2];
		
		for(int i=0; i<cnt ; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st1.nextToken());
			arr[i][1] = Integer.parseInt(st1.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {    //0인덱스에 대한 정렬
			public int compare(int[]o1, int[]o2) {
			return o1[0]-o2[0];
			}
	});
		
		Arrays.sort(arr, new Comparator<int[]>() {    //1인덱스에 대한 정렬
			public int compare(int[]o1, int[]o2) {
			return o1[1]-o2[1];
		}
	});
		
		int count = 0;
		int end_time = 0;
		
		for(int i=0; i<cnt; i++) {
			if(arr[i][0]>=end_time) {                   //종료시간에 따라 시작시간을 결정하고 그 수를 count++
				end_time = arr[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
