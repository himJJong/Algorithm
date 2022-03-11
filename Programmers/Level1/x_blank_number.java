class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0]=x;
        for(int i=1;i<n;i++){
            answer[i]=answer[i-1]+x;
        }
        return answer;
    }
}

//프로그래머스 x번째 간격이 있는 n개의 숫자
//처음 실패 - test13,14 에서 오류가 났었는데 첫번째 코드는 각 배열 인덱스에 각각 값을 곱해서 새로 넣어주었다.
//성공 코드 - 새롭게 전부 곱해서 넣어주는거 말고, 전에 했던 계산을 넣어보는 생각으로 구현해봤더니 성공하였다.
