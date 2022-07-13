package algorithm;
import java.io.*;
import java.util.*;

public class Test {
	static int[][] arr;
	static int num=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());
        int[] answer = new int[testcase];
        
        for(int s=0;s<testcase ;s++) {
        	st = new StringTokenizer(br.readLine());
        	int n =Integer.parseInt(st.nextToken());
        	int m =Integer.parseInt(st.nextToken());
        	
        	for(int i=1; i<n;i++) {
            	for(int j=i+1;j<n;j++) {
            		 if(((i*i)+(j*j)+m)%(i*j)==0) {
            			 answer[num]+=1;
            		 }
            	}
            }
        	num++;
            }
        
       for(int i=0; i<testcase ; i++) {
    	   System.out.println(answer[i]);
       }
    }
}
