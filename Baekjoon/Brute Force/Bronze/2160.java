package algorithm;
import java.util.*;
import java.io.*;

public class plus {
	static char map[][][];
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);;
    	
    	int answer = 0;
    	int val = Integer.MAX_VALUE;
		int N = sc.nextInt();
		int arr[] = new int[N];
		int[] result = new int[2]; 
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			arr[i] = i;
		}

		map = new char[N][5][7];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++) {
				String line = sc.nextLine();
				for (int k = 0; k < 7; k++) {
					map[i][j][k] = line.charAt(k);
				}
			}
		}
		
		for( int i=0; i<N-1;i++) {
			for(int j=i+1; j<N ;j++) {
				for(int k =0; k<5 ; k++) {
					for(int l =0; l<7; l++) {
						if(map[i][k][l]!=map[j][k][l]) {
							answer++;
						}
					}
					
					}
				if(answer<val) {
					result[0] = i;
					result[1] = j;
					val=answer;
				}
				answer=0;
			}				
			}
		for(int i=0; i<2 ;i++) {
			System.out.println(result[i]+1);
		}
		}
	}
