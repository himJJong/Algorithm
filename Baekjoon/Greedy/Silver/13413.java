package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	        StringTokenizer stringTokenizer;

	        int testCase = Integer.parseInt(br.readLine());            //testcase 개수 
	        

	        while(testCase-- > 0){
	            stringTokenizer = new StringTokenizer(br.readLine());		

	            char[] bit1 = br.readLine().toCharArray();	// bit1의 char bit1 배
	            char[] bit2 = br.readLine().toCharArray();	// bit2의 char bit1 배 

	            int cntw = 0;
	            int cntb = 0;
	            for(int i = 0; i < bit1.length; i++){	//길이만큼 
	                if(bit1[i] != bit2[i]){
	                    if(bit1[i] == 'W')				//bit1 , bit2 다르다면 
	                        cntw++;					//bit1[i] 가 1이면 cntone++; 
	                    else
	                        cntb++;					//bit1[i] 가 0이면 cntzero++;
	                }
	            }

	            if(cntb < cntw){
	                sb.append(cntb + Math.abs(cntb - cntw)).append("\n");
	            }
	            else if(cntw < cntb){
	                sb.append(cntw + Math.abs(cntb - cntw)).append("\n");
	            }
	            else{
	                sb.append(cntw).append("\n");
	            }
	        }

	        System.out.print(sb);
	    }
	    
	}
