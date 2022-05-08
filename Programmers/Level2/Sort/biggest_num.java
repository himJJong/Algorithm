package programmers;

import java.util.*;

public class Test1 {
	
  int[] numbers = {3,54,2};
	public static void main(String[] args) {
		
		
		String answer ="";
		
		String[] str = new String[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			str[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(str,new Comparator<String>(){
			public int compare(String o1,String o2) {
				return(o2+o1).compareTo(o1+o2);
			}
		});
		
		for(String arr : str) {
			answer+=arr;
		}
		
		if(str[0].equals("0")) answer = "0";
		System.out.println(answer);		
	}
	
}

