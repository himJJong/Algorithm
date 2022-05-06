class Solution {
    public int[] solution(int[] answers) {
        
		int[] pe1 = {1,2,3,4,5};
		int[] pe2 = {2,1,2,3,2,4,2,5};
		int[] pe3 = {3,3,1,1,2,2,4,4,5,5};
		
		
		int[] place = new int[3];
		
		for(int i=0; i<answers.length; i++) {
			if(answers[i]==pe1[i%5]) place[0]++;
			if(answers[i]==pe2[i%8]) place[1]++;
			if(answers[i]==pe3[i%10]) place[2]++;
		}
		
		int result=0;
		
        for(int i=0; i<3 ;i++){
            if(place[i]>result)
                result=place[i];
        }
		
		int count=0;
		for(int i=0; i<3;i++) {
			if(place[i]==result) {
				count++;
			}
		}
		
		int[] answer = new int[count];
		int j=0;
		for(int i=0; i<3 ; i++) {
			
			if(place[i]==result) {
				answer[j++]=i+1;
				
			}
        }
	    return answer;
		
	}
}
