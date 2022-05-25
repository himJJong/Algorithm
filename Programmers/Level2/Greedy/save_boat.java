//1번째 방법 이중for문
//2번째 방법 큐
//3번째 방법 배열 사용
//간과했던 점은 최소한의 보트를 사용한다고 할때 단순히 Arrays.sort만 사용하고 앞부터 조회했는데, 최댓값과 최솟값의 비교가 필요하다는 것을 알았다. + 보트는 2명씩만 탈 수 있는 조건이 있었음.
//문제를 제대로 읽지 않고 예시만 보는 경향이 있어 차근차근 읽어나가는 습관을 가져야겠다.

import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        
		int answer = 0;
		
		if(people.length==1) {
			//return 1;
		}
		
		//50 50 30 70 80
		Arrays.sort(people);
		
		int front = 0;
		int back = people.length-1;
		
		while(back>front) {
			if(people[front]+people[back]<=limit) {
				answer++;
				front++;
				back--;
			}
			else {
				answer++;
				back--;
			}
		}
		if(front==back) {
			answer++;
		}
		return answer;
		
	}
}
