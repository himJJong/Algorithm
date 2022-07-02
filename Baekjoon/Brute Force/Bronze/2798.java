package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];							// 카드 값 
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);			
		int answer= 0;	// 결과
		int max = 0;
		int[] num = new int[3];
		
		Label:for(int i=0; i<n-2 ; i++) {
					for(int j=1+i; j<n-1 ;j++) {
			 			for(int l=i+2; l<n;l++) {
			 				answer = arr[i]+arr[j]+arr[l];
			 				if(answer == k) {
			 					num[0]=i;
			 					num[1]=j;
			 					num[2]=l;
			 					break Label;
			 				}
			 				else if(answer<k){
			 					max = Math.max(max, answer);
			 				}
					}
				}
			}
		if(answer==k) {
			System.out.println(answer);
			
		}
		else {
			System.out.println(max);
		}
		}
		
	}
