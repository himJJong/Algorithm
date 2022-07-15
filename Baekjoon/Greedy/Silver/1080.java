//XOR연산자를 사용하여 뒤집기 방법 
package algorithm;

import java.util.*;
import java.io.*;

public class plus {
	static int A,B;
	static int answer=0;
	static int[][] matA;
	static int[][] matB;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		matA = new int[A][B];
		matB = new int[A][B];
		
		
		// matA input
		for ( int i=0; i<A; i++) {
			String str = br.readLine();
			for ( int j=0; j<B; j++) {
				matA[i][j] = str.charAt(j);
			}
		}
		
		// matB input
		for ( int i=0; i<A; i++) {
			String str = br.readLine();
			for ( int j=0; j<B; j++) {
				matB[i][j] = str.charAt(j);
			}
		}
		
		if(A<3 || B<3) {		// 주어진 행렬 크기가 3X3보다 작을 
			if(isSame(matA,matB)) {		//행렬값이 서로 같다면 바꿀필요 없으므로 0 출력  
				answer =0;
			}
			else
				answer= -1;	//그 외에는 변환이 불가하기 때문에 -1 출력 
		}
		else {
			Solution();
		}
		if(!isSame(matA,matB)) {		//변환 시도했지만 같지 않은 경우 
			answer = -1;
		}
		
		System.out.println(answer);
}
	
	private static void Solution() {
		for(int i=0; i<A-2;i++) {
			for(int j=0; j<B-2; j++) {
				if(matA[i][j]!=matB[i][j]) {
					filp(i,j);
					answer++;
				}
			}
		}
	}
	
	private static void filp(int first, int set) {
		for(int i=first;i<first+3;i++) {
			for(int j=set;j<set+3;j++) {
				matA[i][j]=matA[i][j]^1; //반대로 뒤집는 방법 XOR연산자 
			}
		}
	}
	
	private static boolean isSame(int[][] matA2, int[][] matB2) {  //행렬A,B 값 순차적으로 비
		for(int i=0; i<A;i++) {
			for(int j=0; j<B ;j++) {
				if(matA2[i][j] != matB2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
