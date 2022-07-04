//시간초과..ㅜ
package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		long arr[][] = new long[cnt][2];
		
		for(int i=0; i<cnt ; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			arr[i][0] = Long.parseLong(st1.nextToken());
			arr[i][1] = Long.parseLong(st1.nextToken());
		}
		
		Arrays.sort(arr,(a,b)->{
			if(a[1]==b[1])
				return (int) (a[0]-b[0]);
			return (int) (a[1]-b[1]);
		});
		
		long ans =0;
		int time =0;
		long sum = 0;
		
		for(int i=0; i<cnt ;i++) {
			for(int j = 0; j < cnt; j++) {
				// 다음회의시작시각 >= 이전회의종료시각
				if (arr[i][0] >= time) { 
					time = (int) arr[i][1];
					arr[i][1]=0;
				}
				sum+=arr[j][1];
			}
			time=1;
			ans++;
			if(sum==0) {
				break;
			}
			sum=0;
		}
		
		System.out.println(ans-1);
	}
}
