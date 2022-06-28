package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args) throws IOException{
		
		
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       String s = br.readLine();
	 
	       int size = s.length();
	       System.out.println(findMax(s, size, 0));
	       System.out.println(findMin(s, size, 0));
	       }
	
	
	    private static String findMin(String str, int size, int k) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < size; i++) {
	            if (str.charAt(i) == 'M') {
	                k = i;
	                while (k < str.length() && str.charAt(k) == 'M') {
	                    k++;
	                }
	                sb.append(1);				// M이 왔을 때 0을 붙이기 왜? -> 최소니까 
	                for(;i+1<k; i++){
	                    sb.append(0);
	                }
	                i = k - 1;
	            } else {
	                sb.append(5);
	            }
	        }
	        return sb.toString();
	    }
	 
	    private static String findMax(String str, int size, int k) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < size; i++) {
	            if (str.charAt(i) == 'M') {
	                k = i;
	                while(k<size && str.charAt(k)=='M'){
	                    k++;
	                }
	                if(k==size){				// M개수 만큼 왔을때 append(1)
	                    for(;i<k; i++){
	                        sb.append(1);
	                    }
	                }
	                else{
	                    sb.append(5);			// M개수 다음 K 왔을 경우 append(5) 후 append(0) 
	                    for(;i<k; i++){
	                        sb.append(0);
	                    }
	                }
	                i=k;						// 증가한 값 만큼 i 증가 
	 
	            } else {						// K가 왔을때는 그냥 5추가 
	                sb.append(5);
	            }
	        }
	        return sb.toString();
	    }
	}
