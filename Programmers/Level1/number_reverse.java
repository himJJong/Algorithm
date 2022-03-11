class Solution {
    public int[] solution(long n) {
        int count=0;
		int num = 0;
        for(int i=9;i>0;i--){
            num = (int)(n/Math.pow(10,i));
            count = i;
            if(num==0){
                continue;
            }
            else{
            	break;
            }
        }
        int[] answer = new int[count+1];
        for(int i=0; i<count+1;i++) {
        	answer[count-i] = (int)(n/Math.pow(10,count-i)); 
        	n-=answer[count-i]*Math.pow(10, count-i);
        }
        return answer;
    }
}

//프로그래머스 자연수 뒤집ㅇ 배열로 만들기
//테스트 케이스 13중 1개 틀린 원인으 못찾음..
