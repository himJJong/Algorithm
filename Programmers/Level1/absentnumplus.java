//프로그래머스 없는 숫자 더하기

package programmers;

public class Test1 {
	public static void main(String[] args) {
		int answer = 45;
		int[] numbers = {1,2,3,4,6,7,8,0};
		int sum =45;
		
		for(int i=0; i<numbers.length; i++) {
			answer-=numbers[i];
		}
		System.out.println(answer);
	}	
}
