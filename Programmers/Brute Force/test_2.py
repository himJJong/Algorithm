# 프로그래머스 고득점 Kit _ Brute Force 2번문제


from itertools import permutations. # itertools라이브러리에서 permutations를 import하여

def solution(numbers):
  answer = 0                     # 초기화
  allnum = []                    
  
  for n in range(len(numbers)):               # 주어진 numbers 길이 범위만큼 
    tmp = list(permutations(numbers, n+1))    # 순열 리스트
    allnum += [int(''.join(i)) for i in tmp]  # 만들 수 있는 모든 경우의 수를 리스트로
   
  for n in set(allnum):                       # 중복을 제거하고 소수인지 판별
    tmp = 0
    for i in range(1, n+1):
      if n % i == 0 and n != 0:
        tmp +=1
      if tmp >= 3:
        break
    if tmp == 2:
      answer += 1
  return answer

"""

1) 내가 이끌어 낸 지점 : 

- 문자열의 조합을 사용하여 몇몇 숫자를 이용하여 소수를 찾아야겠다는 생각

2) 이끌어내지 못한 지점 :

- 여러 상황을 고려하여 순열을 이용해볼까 하는 생각은 해보았지만, 실질적인 구현이나 디테일하게 소수 판별 같은
자세한 구현은 하지 못하였다.

3) 새로 알게 된 점 :

- itertools 라이브러리, permutations에 관한 것, set

 # 프로그래머스 문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42839
 
"""

       
    
