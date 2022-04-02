//프로그래머스 정수 제곱근 판별

class Solution {
    public long solution(long n) {

        Double sqrt = Math.sqrt(n);
        if(sqrt==sqrt.intValue()) {
            long num = (long)Math.sqrt(n);
            return ((num+1)*(num+1));
        }
        else
            return -1;
    }
}


// 좋았던 다른 사람 풀이

class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
      }
        return -1;
  }
}
