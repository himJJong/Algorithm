//프로그래머스 나누어 숫자 배열하기
// 직관적으로 풀어본 방식 (1)
package programmers;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int count =0;
		int divisor = 2;
		
		int[] pre = new int[arr.length];
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor==0) {
				pre[count]=arr[i];
				count+=1;
			}
			else {
				continue;
			}
		}
		int[] answer = new int[count];
		
		if(count==0) {
			answer = new int[1];
			answer[0]=-1;
		}
		else {
			for(int i=0;i<count;i++) {
				answer[i]=pre[i];
			}
		}
		Arrays.sort(answer);
		
		for(int i : answer) {
			System.out.println(i);
		}
	}	
}

// ArrayList를 사용한 방식 

package programmers;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int[] arr = {2,36,1,3};
		int[] pre = new int[arr.length];
		int divisor = 1;
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor==0) {
				list.add(arr[i]);
				count+=1;
			}
			else {
				continue;
			}
		}
		if(count==0) {
			list.add(-1);
			
		}
		int[] answer = list.stream()
						.mapToInt(Integer::intValue)
						.toArray();
		
		Arrays.sort(answer);
		for(int i=0; i<answer.length;i++) {
			System.out.println(answer[i]);
		}
		
	}	
}

