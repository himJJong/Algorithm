package algorithm;
import java.io.*;
import java.util.*;

public class Test {
	static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 0;
        arr = new int[n][m];                          //입력받을 동전 앞뒤면 데이터 

        for(int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split("");   // tmp[] 배열에 입력하는대로 split
            for(int j = 0; j < m ; j++){
                arr[i][j] = Integer.parseInt(tmp[j]); // String -> Int 로 변환하여 arr[][]에 데이터 넣기 
            }
        }

        for(int i = m - 1; i >= 0; i--) {             // 마지막 행,렬 부터 열을 기준으로 검사 
            for(int j = n - 1; j >= 0; j--) {
                if(arr[j][i] == 1) {
                    reverse(j, i);                    // 해당 배열이 1인 경우 reverse()
                    
                    answer += 1;                      // answer++
                }
                
            }
        }
        System.out.println(answer);
    }

    static void reverse(int x, int y) {
        for(int i = 0; i <= x; i++) {                 // 첫번째 행부터 
            for(int j = 0; j <= y; j++) {             // 첫번째 열부터 검사하여 전부 반대로 바꾼 후 
                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = 1;
                }
            }
        }
    }

    
}
