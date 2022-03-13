public class Solution {
    public int solution(int n) {
        int answer = 0;
		String str_n = String.valueOf(n);
		String[] strArray = str_n.split("");
		
		for(String s : strArray) {
			int sum  = Integer.parseInt(s);
			answer+=sum;
		}
		return answer;
    }
}
// 프로그래머스 자릿수 더하기
