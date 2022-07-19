import java.util.*;

import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int answer = -3;
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int startx = Integer.parseInt(st.nextToken());
		int starty = Integer.parseInt(st.nextToken());
		
		int num = 0;
		for(int i=0; i<101; i++) {
			if(startx<starty) {
				startx+=x;
			}
			else if(startx>starty) {
				starty+=y;
			}
			else if(startx==starty){
				answer = startx;
				break;
			}
		}
		if(answer>0) {
			System.out.println(answer);
		}
		else if(answer==-3){
			System.out.println(-1);
		}
    }
}
