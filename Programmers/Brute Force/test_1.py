# 프로그래머스 고득점 Kit _ Brute Force 1번문제


def solution(answers):
    answer = [0 for i in range(3)]      # answer에 수포자들의 점수 3개의 공간을 가진 배열 값 초기화

    man1 = [1,2,3,4,5]                  # 수포자 1
    man2 = [2,1,2,3,2,4,2,5]            # 수포자 2
    man3 = [3,3,1,1,2,2,4,4,5,5]        # 수포자 3
    
    for i in range(len(answers)):       # 시험 문제의 답 길이
        ans = answers[i]                # 각각 index에 해당하는 값을 ans에 넣고 수포자1,2,3의 index에 비교하여 같은 값이 있으면 +1 
        if(man1[i%len(man1)] == ans):
            answer[0] += 1
        if(man2[i%len(man2)] == ans):
            answer[1] += 1
        if(man3[i%len(man3)] == ans):
            answer[2] += 1     
    
    result = []                         # 수포자들의 점수 결과 값
    for i in range(len(answer)):
        if(answer[i] == max(answer)):   # 수포자들의 점수 중 가장 큰 index의 value와 answer[0]~answer[2] 까지 같은 것을 찾으면 
            result.append(i+1)          # 결과 값에 추가( +1을 해준 이유는 index는 0 부터 세었기 때문)
    
    return result
  
  
  
 """
  
1) 내가 이끌어 낸 지점 : 
- 수포자들의 각자 패턴의 길이를 연산하여 같은 값이 나오면 점수 +1 
- 그 중 max값으로 return 값 호출

2) 이끌어내지 못한 지점 :

- 새롭게 배열을 추가하여 자유롭게 활용하지 못한 점.
- ans = answers[i] 이렇게 활용하는 점도 생각해내지 못함.

# 프로그래머스 문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42840

  """
