import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        
        
		int[] answer = new int[prices.length];
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<prices.length-1; i++) {
			int time = 0;
			int index = 1;
			queue.add(prices[i]);
            
			while(true) {
				if(queue.peek()<=prices[i+index]) {			// 주식이 떨어지지 않으면 
					if(i+index==prices.length-1) {
						time++;
						answer[i] = time;
						queue.poll();
						break;}
					else{
						time++;
						index++;}
                }
			
				else {
					time++;						// 주식이 떨어지면 
					answer[i] = time;
					queue.poll();
					break;}
			}
		}
		answer[prices.length-1]=0;
		return answer;
        }
	}
