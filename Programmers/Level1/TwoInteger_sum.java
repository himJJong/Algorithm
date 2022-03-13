class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        if(a>b) {
            for(int i=b;i<a+1; i++) {
                answer+=i;
            }
        }
        else if(a==b)
            answer=a;

        else if(b>a){
            for(int i=a;i<b+1;i++) {
                answer+=i;
            }
        }
        return answer;
    }
}

//프로그래머스 두 정수의 합
