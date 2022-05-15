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
