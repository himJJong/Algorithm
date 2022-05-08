class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int[] answer = new int[2];		
		int num = 0;
		int zero = 0;
		
		
		for(int i=0; i<lottos.length;i++) {
			for(int j=0; j<win_nums.length;j++) {
				if(lottos[i]==win_nums[j]) {
					num+=1;
				}
				else if(lottos[i]==0) {
					zero+=1;
					break;
				}
				else
					continue;
			}
		}
		
		if(zero==0) {
			if(num==0 || num==1) {
				answer[0]= 6;
				answer[1]= 6;
			}
			else {
				answer[0]=7-num; 
				answer[1]=7-num;
			}	
			
		}
		else if (zero==1) {
			if(num==0) {
				answer[0]=6; 
				answer[1]=6;
			}
			else {
				answer[0]= 7-(num+zero);
				answer[1]= 7-num;
			}
		}
        else if(zero==6){
            answer[0]= 7 - (num+zero);
			answer[1]= 6 - (num);
        }
		else {
			
			answer[0]= 7 - (num+zero);
			answer[1]= 7 - (num);
			
		}
		
		
		return answer;
	}
}
