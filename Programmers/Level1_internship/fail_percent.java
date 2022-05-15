package algorithm;

import java.util.Arrays;		//필요한 것 Import
import java.util.Scanner;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		
		int[] check = new int[N];			// 같은 배열 체크 
		double[] rate = new double[N];			// 실패율 값 배
		int[] answer = new int[N];			// 결과 값 배열
		Arrays.sort(stages);
		
		//같은 배열요소 개수 
   		//스테이지 클리어 한거는 생각x , i번째 배열은 i+1스테이지
		for(int i=0; i<N;i++) {
			for(int j=0; j<stages.length;j++) {
				if (stages[j]==i+1) {
					check[i]++;
				}
			}				
		}
		
		//실패율 
		int denominator = stages.length;
		for(int i=0; i<check.length;i++) {
			int numerator = check[i];
			if(denominator==0) {    
				rate[i]=0;
			}
			else {
				rate[i]=(double) numerator/denominator;   // 실패율이 정수로 안나누어 떨어지기에 double
				System.out.println(rate[i]);
			}
			denominator -= check[i];                    	 // 전체 확률에서, 앞선 check[i] 스테이지 빼기
		}
		
		//결과
		double max= 0;
		int target=1;
		
		for (int i=0; i<rate.length; i++) {
			max = rate[0];
			target = 1;
			for(int j=0; j<rate.length;j++) {
				if(rate[j]>max) {                        // 큰값 비교		
					max=rate[j];                     // 인데스 보다 +1인 스테이지 갑 정의
					target = j+1;
				}
			}
			rate[target-1] = -1;                       	// 체크한 실패율 -1 초기화
			answer[i] = target;                         	// 실패율 큰값부터 추가
		}
		
	}
}
