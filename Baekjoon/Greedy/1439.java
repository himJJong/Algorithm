//for, if문으로 짜는 코드는 한계가 있다. 이제 다르게 생각하고, 아래 방법은 지양하도록 하자.
package algorithm;

import java.io.*;
import java.util.*;


public class Test {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		String[] array = n.split("");
		int zerotoone = 0;		//0 -> 1로  
		int onetozero = 0;		//1 -> 0
		int result = 0;
		
		
		for(int i=0; i<array.length-1 ;i++) {
			if(array[i].equals("0") && array[i+1].equals("1")) {
				zerotoone++;
			}
			else if(array[i].equals("0") && array[i+1].equals("0")) {
				continue;
			}
			else if(array[i].equals("1") && array[i+1].equals("1")) {
				continue;
			}
			else if(array[i].equals("1") && array[i+1].equals("0")) {
				onetozero++;
			}
	}
		int max = Math.max(onetozero, zerotoone);
		
		if(Math.abs(zerotoone-onetozero)== 1) {
			result = max;
		}
		else {
			if(zerotoone<onetozero) {
				result = zerotoone;
			}
			else if(zerotoone==0 && onetozero==0) {
				result =1;
			}
			else if(zerotoone == onetozero) {
				result = onetozero;
			}
			else {
				result = onetozero;
			}
		}
		
		// 하나는 0 하나는 2 일때 경우 추
		
		System.out.println(zerotoone);
		System.out.println(onetozero);
		System.out.println(result);
}
}

//제일 좋았던 다른 사람 풀이
// StringTokenizer로 0,1을 구분자로 사용 후 최솟값이 문제에서 원하는 return값
package algorithm;

import java.io.*;
import java.util.*;


public class Test {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st1 =new StringTokenizer(s,"0");
		StringTokenizer st0 =new StringTokenizer(s,"1");
		System.out.println(Math.min(st1.countTokens(),st0.countTokens()));
	}
}


