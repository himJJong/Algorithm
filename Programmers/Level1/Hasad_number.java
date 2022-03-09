class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        double[] a = new double[5];
        double ram = (double) x;
        int sum = 0;
        for(int i=4; i>=0;i--){
            a[i] = ram/ (Math.pow(10, i));
            ram = ram%(Math.pow(10, i));
            sum+=a[i];
        }
        if(x%sum==0){
        }
        else{
            answer=false;
        }
        return answer;
    }
}

// 프로그래머스 하사드 수
