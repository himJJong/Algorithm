//프로그램스 제이 작은수 제거하기

class Solution {
    public int[] solution(int[] arr) {
        int min = 100000000;

        int[] answer=new int[arr.length-1];
        int[] onearr = {-1};


        if(arr.length==1) 
            return onearr;

        else {
            for(int i: arr) 
                min = Math.min(i, min);
            }

        for(int i=0,j=0; i<arr.length;i++) {
            if(arr[i]==min) {
                continue;
            }
            else {
                answer[j]=arr[i];
                j++;
            }
        }
        return answer;  
    }
}
