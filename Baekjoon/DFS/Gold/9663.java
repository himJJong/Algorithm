package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Test {
	public static int[] arr;
	public static int N;  //체스판 크기
	public static int count = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		nQueen(0);
		System.out.println(count);
	}
	
	
	//1차원 배열을 토대로 재귀함수 짠 
	public static void nQueen(int depth) {
		//행을 다 채우면 카운트를 1 증가시키고 리턴 시킨다.
		if(depth == N) {
			count++;
			
			return;
		}
		
		for(int i=0; i<N ;i++) {
			arr[depth] = i;
			//Possibility() 해당 열에서 i번째 행에 놓을 수 있는지 검사하는 함수 
			if(Possibility(depth)) {
				nQueen(depth+1);
			}
		}
	}
		
	public static boolean Possibility(int col) {
		for (int i=0; i<col ;i++) {
			//해당 열의 행과 i열의 행이 일치하는 경우 (같은 행에 존재할 경우)
			if(arr[col] == arr[i]) {
				return false;
			}
			//대각선상에 있는경우 
			
			else if(Math.abs(col-i)==Math.abs(arr[col]-arr[i])) {
				return false;
			}
		}
		return true;
	}
}


	
