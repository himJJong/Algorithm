package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Test {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Level = Integer.parseInt(br.readLine());
		int[] point = new int[Level];
		int answer = 0;
		
		for(int i=0; i<Level ;i++) {
			point[i] = Integer.parseInt(br.readLine());
		}
		
		//point[Level] 값을 확인 후 
		for(int i=Level-1; i>0 ;i--) {
			if(point[i]<=point[i-1]) {
				while(true) {
					if(point[i-1]>=point[i]) {
						point[i-1]-=1;
						answer++;
					}
					else {
						break;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
