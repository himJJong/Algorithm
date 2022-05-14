// + replace의 함수, 부족한 배열 크기 채워주기
ackage programmers;

import java.util.*;
public class Test1 {
	
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		int[] sumarr = new int[arr1.length];
		String[] answer = new String[n];
		for(int i=0; i<n ;i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
			answer[i] = answer[i].replace('0',' ');
			answer[i] = answer[i].replace('1','#');
			
		while (answer[i].length() < n) {
				answer[i] = ' ' + answer[i];
			}
			
		}
		
       for(int i=0; i<n ; i++) {
    	   System.out.println(answer[i]);
       }
    }
}

// 부족한 숫자 자리의 크기 채워주지 못함, 사이즈가 커지면 한계가 있음. (오류코드)
package programmers;
import java.util.*;

public class Test1 {
	
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		int[] sumarr = new int[arr1.length];
		String[][] space = new String[arr1.length][arr1.length];
		String[] answer = new String[arr1.length];
		
		
		for(int i=0; i<arr1.length;i++) {
			sumarr[i] = (arr1[i]|arr2[i]);
			answer[i] = Integer.toBinaryString(sumarr[i]);
			if(answer[i].equals("1")) {
				answer[i]="#";
			}
			else answer[i]=" ";
			
		}
		
		String[] answer2 = new String[arr1.length];
		for(int i=0; i<arr1.length ;i++) {
			answer2[i] = answer[i].substring(arr1.length,arr1.length*2);
			System.out.println(answer2[i]);
		}
	}
}
