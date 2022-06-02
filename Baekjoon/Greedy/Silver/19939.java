package algorithm;

import java.io.*;
import java.util.*;


public class Test {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
        
		int ball = Integer.parseInt(st.nextToken());
		int team = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[team]; //바구니 개수 배열 
		// 바구니 개수에 맞게 순차적인 값 넣을 수 있는 
		for(int i=1; i<team+1;i++) {
			ball-=i;
			if(ball<0) {
				break;
			}
		}
		if(ball>=0) {
			if(ball%team>0) {
				sb.append(team);
			}
			else {
				sb.append(team-1);
			}
		}else {
			sb.append(-1);
		}
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
		
	}
}

