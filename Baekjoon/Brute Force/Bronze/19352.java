package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	static int result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr= new int[6];
		for(int i =0; i<arr.length;i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		int[] result = new int[6];
		int x = 0;
		int y = 0;
		
		if(arr[0]!=0&&arr[1]!=0&&arr[3]!=0&&arr[4]!=0) {
			for(int i=0; i<3;i++) {
				result[i] = arr[3]*arr[i]; 
			}
			
			for(int i=3;i<6;i++) {
				result[i]= arr[0]*arr[i];
			}
			
			
			if(result[0]+result[3]==0) {	//x변수 부호가 다를 때 
				if(result[1]+result[4]<1 && result[1]+result[4]>0) {
					y=0;
				}
				else {
					y = (result[2]+result[5])/(result[1]+result[4]);
				}
			}
			else {							//x변수 부호가 같을 때 
				y = (result[2]-result[5])/(result[1]-result[4]);
			}
			
			x = (arr[2]-arr[1]*y)/arr[0];
			
		}
		else {
			if(arr[0]==0) {
				y = arr[2]/arr[1];
				x = (arr[5]-arr[4]*y)/arr[3];
			}
			else if(arr[1]==0) {
				x = arr[2]/arr[0];
				y = (arr[5]-arr[3]*x)/arr[4];
			}
			else if(arr[3]==0) {
				y = arr[5]/arr[4];
				x = (arr[2]-arr[1]*y)/arr[0];
			}
			else if(arr[4]==0) {
				x = arr[5]/arr[3];
				y = (arr[2]-arr[0]*x)/arr[1];
			}
		}
		System.out.print(x+" ");
		System.out.print(y);
	}
}
