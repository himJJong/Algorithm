package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		int total = 0;									//결과값 
		int rest = 0;									//앞의 남은 공간 rest
		
		int[] testcase1 = new int[testcase];			//testcase 개수 
		
		for(int i=0; i<testcase ;i++) {						
			String[] inputs = br.readLine().split(" ");
			
			int candy = Integer.parseInt(inputs[0]);	
			int box = Integer.parseInt(inputs[1]);
			int[] sort = new int[box];
			String[][] arr = new String[box][2];
			
			
			for(int j=0; j<box ;j++) {
				arr[j] = br.readLine().split(" ");
			}
			for(int j=0; j<box ; j++) {
				sort[j]=Integer.valueOf(arr[j][0])*Integer.valueOf(arr[j][1]);
			}
			Arrays.sort(sort);	// sort배열에 크기대로 넣어주기 
			
			for(int j=0; j<box ; j++) {
				if(sort[sort.length-j-1]-candy<0) {	//상자추가 
					total++;
					candy = Math.abs(sort[sort.length-j-1]-candy);
				}
				else {					//상자 딱맞	
					total++;
					break;
				}
		}
			testcase1[i]=total;
			total=0;
			
	}
		for(int i=0; i<testcase ; i++) {
			System.out.println(testcase1[i]);
		}
	}
}
