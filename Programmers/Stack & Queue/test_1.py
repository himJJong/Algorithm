def solution(progresses, speeds):                   # solution 이라는 함수 이름
    answer = []                                     # return받을 answer 의 빈 리스트 생성
    
    while progresses:                               # progresses이 안에 값이 있다면 아래 코드 실행
        for i in range(len(progresses)):            # i라는 변수 안에 progresses의 리스트 길이만큼 for문 실행
            progresses[i]+=speeds[i]                # 각각의 progresses의 기능에 각각의 다른 speeds를 +
        cnt=0                                       # cnt는 진행이 완료되어 배포할 수 있는 변수인데 여기서 초기화 해준다
        
        while progresses and progresses[0]>=100:    # progresses and progresses[0]의 값이 100 이상이라면 
            progresses.pop[0]                       # progresses[0]을 pop 해서 삭제
            speeds.pop[0]                           # speeds[0]을 pop 해서 삭제
            cnt+=1                                  # cnt +1
        if cnt>0:                                   # cnt 가 0보다 크다면 
            answer.append(cnt)                      # return할 answer의 값에 몇개가 배포 되었는지 추가
    
    return answer                                   # return으로 원하는 answer값 출력
  
  
""" 
이 코드를 가져온 이유는 여러 해답을 찾아본 코드 중 나랑 가장 비슷하게 풀이했기 때문

1) 내가 이끌어 낸 지점 : 

- 각각 progresses의 배포 과정을 보고 queue를 사용하고, 선입선출이 필요하다는 것을 catch
- progresses 와 speeds 의 각각 할당 되어있는 값이 존재하고, 계속 누적하는 식 까지 catch

2) 이끌어내지 못한 지점 :

- 9행의 progresses[0]이 100이상이라면 0의 원소를 뽑아내는 것까지는 생각했지만 progresses가 존재해야한다는 가정을 생각하지 못함
- 14행의 출력 코드를 13행의 if문 없이 가져다 붙인 점

3) 느낀점 : 

- 프로그래머스 문제를 처음 풀어보는데 생각보다 많이 어렵다고 느껴지지 않았다. 주관적인 느낌으로 어려운 부분은 문제 풀이를 많이 해보지 않아
직접 구현하는 것 그리고 디테일하게 생각하지 않는 것 같다.

4) 새로 알게 된 점 :

- 다른 좋은 풀이중 많이 칭찬을 받은 코드중에 zip, ceil, lambda를 쓴 코드가 있었는데 함수에 대해서만 훑어보았다.

"""
