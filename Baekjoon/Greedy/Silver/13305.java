package algorithm;

import java.io.*;
import java.util.*;


public class Triangle {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int cnt = Integer.parseInt(br.readLine()); 
        long total = 0;
        long oil[] = new long[cnt];
        long street[] = new long[cnt-1];
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i < street.length; i++) {
            street[i] = Integer.parseInt(st2.nextToken());
        }
       
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i < oil.length; i++) {
            oil[i] = Integer.parseInt(st1.nextToken());
        }
        
        for(int i=0; i<cnt-1;i++) {
        	total += oil[i]*street[i];
        	if(oil[i]>oil[i+1]) {			//다음 국가의 oil 값이 적은 경우 
        		continue;
        	}
        	else {							//다음 국가의 oil 값이 큰 경우  
        		oil[i+1]=oil[i];
        	}
        }
        System.out.println(total);
	}
}

