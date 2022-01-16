 # 프로그래머스 고득점 Kit _ Stack & Queue 4번 문제
  
  
def solution(prices):           
    answer = [0] * len(prices)            # 주어진 배열 크기만큼의 빈 리스트 만들어 초기화
    for i in range(len(prices)):          # i 0 ~ len(prices)
        for j in range(i+1, len(prices)): # j 1 ~ len(prices)
            if prices[i] <= prices[j]:    # 다음번째 주식 가격이 크거나 같다면 현재 것에 +1
                answer[i] += 1
            else:                         # 현재 주식 가격이 더 크다면 +1하고 break
                answer[i] += 1
                break
    return answer
  
  
 """
 
 1) 내가 이끌어 낸 지점 :
 
 - 문제 그대로 푸는 것은 성공했지만 효율적으로 좋은 코드를 만들지는 못했다
 
 2) 이끌어내지 못한 지점 :
 
- 이 풀이에서 핵심은 (시간의 흐름대로) 반복문을 계속 진행하면서 현재 시점보다 가격이 높은 시점이 언제였는지 되짚어가면서 판단하는 방식이다.

 3) 느낀점 :
 
 - 스택 큐 문제들이지만 전부 if,for 문으로 풀었기에 해당 영역을 써가며 다른 방식으로 해보는 방법도 시도해보는게 좋을 것 같다.
 
  # 프로그래머스 문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42584
  
 """
