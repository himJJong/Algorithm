class Solution {
    public int solution(int num) {
        int answer = 0;
        int count=0;


        for(int i=1;i<501;i++){
            if(num==1){
                answer=count;
                break;
            }

            else if(num%2==0){
                num=num/2;
                count=i;
            }
            else if(num%2==1){
                num=num*3+1;
                count=i;
            }

            else if(i==500) {
                answer=-1;
                break;
            }
        }
        return answer;

    }
}

// 프로그래머스 콜라츠 추측
