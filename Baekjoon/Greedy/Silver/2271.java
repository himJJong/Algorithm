package algorithm;

import java.io.*;
import java.util.*;


public class Triangle {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int cnt = Integer.parseInt(st.nextToken());
        int arr[] = new int[cnt];
        int var = 0;
        int max = 0;
        int num = 1;
        
        for(int i=0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        for(int i=cnt-1; i>=0 ;i--) {
        	var = arr[i]*num;
        	max = Math.max(max,var);
        	num++;
        	System.out.println(max);
        }
	}
}
