package algorithm;

import java.io.*;
import java.util.*;

public class Test { 
	static int[] dp;
	static int min;
    public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;				// 1 = 1 * 1 로 고정이므로 1개 
	 
		solve(n);
	 
		System.out.println(dp[n]);
	}
	
	static void solve(int n) {
		for (int i = 2; i <= n; i++) {				// for( 2<=i<=n )
			int min = Integer.MAX_VALUE;			// 최솟값을 비교할 것이므로 아래 for문이 도는 처음에 값 설정
			for (int j = 1; j * j <= i; j++) {	
				min = Math.min(min, dp[i - j * j]);	// 앞에 만든 dp로 계속 끌고간다.
			}
			dp[i] = min + 1; 				// 값의 최솟값을 dp배열 i번째 인덱스에 저장하고 뒤에서 계속 사용할 것
		}
	}
}    	
