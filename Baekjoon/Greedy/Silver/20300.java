package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		long arr[] = new long[cnt];
		long total = 0;
		
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i < cnt; i++) {
            arr[i] = Long.parseLong(st1.nextToken());
        }
        
		Arrays.sort(arr); 		// 팁을 많이 주고 싶은 순서
		long max = 0;
		
		
		if(cnt%2==1) {	// 운동기구 홀수인경우 
			max = arr[cnt-1];
			for(int i=0 ; i<(arr.length-1)/2 ;i++) {
				max = Math.max(max, arr[i]+arr[cnt-2-i]);
			}
		}
		else {					// 운동기구 짝수인경우 
			for(int i=0; i<(arr.length)/2 ;i++) {
				max = Math.max(max, arr[i]+arr[cnt-1-i]);
			}
		}
		System.out.println(max);
		
	}
}
