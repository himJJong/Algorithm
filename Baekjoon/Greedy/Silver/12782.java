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

	            char[] bit1 = stringTokenizer.nextToken().toCharArray();	// bit1의 char bit1 배
	            char[] bit2 = stringTokenizer.nextToken().toCharArray();	// bit2의 char bit1 배 

	            int cntOne = 0;
	            int cntZero = 0;
	            for(int i = 0; i < bit1.length; i++){	//길이만큼 
	                if(bit1[i] != bit2[i]){
	                    if(bit1[i] == '1')				//bit1 , bit2 다르다면 
	                        cntOne++;					//bit1[i] 가 1이면 cntone++; 
	                    else
	                        cntZero++;					//bit1[i] 가 0이면 cntzero++;
	                }
	            }

	            if(cntZero < cntOne){
	                sb.append(cntZero + (cntOne - cntZero)).append("\n");
	            }
	            else if(cntOne < cntZero){
	                sb.append(cntOne + (cntZero - cntOne)).append("\n");
	            }
	            else{
	                sb.append(cntOne).append("\n");
	            }
	        }

	        System.out.print(sb);
	    }
	    
	}
