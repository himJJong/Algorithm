//프로그래머스 내적

class Solution {
    public int solution(int[] a, int[] b) {
        int[] result = new int[a.length];
        int answer = 0;

        for(int i=0; i<a.length ;i++) {
            result[i]=a[i]*b[i];
            answer+=result[i];

        }
        return answer;
    }   
}
