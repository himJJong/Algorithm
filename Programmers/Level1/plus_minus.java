//프로그래머스 음양더하기

package programmers;

public class Test1 {
	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		int[] result = new int[absolutes.length];
		int answer = 0;
		
		for(int i=0; i<absolutes.length;i++) {
			if(signs[i]==true) {
				result[i]=absolutes[i];
			}
			else {
				result[i]=-absolutes[i];
			}
			answer+=result[i];
		}
		System.out.println(answer);
	}	
}
