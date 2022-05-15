//배열로 구현
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       
		int day =0;
		int[] temp = new int[100];
		
		
		for(int i=0; i<progresses.length;i++) {
			while(progresses[i]+(speeds[i]*day)<100) {
				day++;
			}
			temp[day]++;
		}
		
		int count =0;
		for(int i=0; i<temp.length;i++) {
			if(temp[i]==0) {
				continue;
			}
			else
				count++;
		}
		
		int[] answer = new int[count];
		int index = 0;
		for(int i=0; i<temp.length;i++) {
			if(temp[i]==0) {
				continue;
			}
			else
				answer[index]=temp[i];
				if(index==count-1) {
					break;
				}
				index++;
		}
		return answer;
	}
}


//queue 
package algorithm;
	
import java.util.*;
public class Test {
	
	public static void main(String[] args) {
		int[] answer = {};
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		ArrayList<Integer> arr = new ArrayList<>();			//answer value arr[]
		Queue<Integer> q1 = new LinkedList<>();				//progresses q1
		Queue<Integer> q2 = new LinkedList<>();				//speeds q2
		
		for(int i=0;i<progresses.length;i++)				//배여 값 add
			q1.add(progresses[i]);
		for(int i=0;i<speeds.length;i++)
			q2.add(speeds[i]);
		int day = 1;
		
		while(!q1.isEmpty()){						//q가 비어있지 않을때까지
			int cnt = 0;
			while(q1.peek() + (q2.peek() * day) < 100)		//첫번째 peek의 day값을 이용해서
				day++;
				
			while (!q1.isEmpty() && q1.peek() + (q2.peek() * day) >= 100){	//같은 day동안 처리 끝난 작업 cnt++
				q1.remove();
				q2.remove();
				cnt++;
				System.out.println(cnt);
			}
			
			if(cnt>0) arr.add(cnt);					//작업이 끝나면 arr.add 
		}
		
		answer = new int[arr.size()];					//알맞은 사이즈 크기로
		for(int i=0;i<arr.size();i++)					//값 대입 get
			answer[i] = arr.get(i);
	}
}
