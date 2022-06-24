package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Test { 
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int arr[] = new int[cnt];
		int num = 0;
		long total = 0;
		
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
		Arrays.sort(arr); 		
		
		total = arr[cnt-1];
		
		for(int i=cnt-2; i>=0;i--) {
			if(arr[i]%2==1) {
				total+=arr[i]/2;
				num++;
			}
			else {
				total+=arr[i]/2;
			}
		}
		
		System.out.println(total+(num*0.5));
	}
}
