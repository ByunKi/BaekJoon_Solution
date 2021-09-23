"""
제출 번호: 33529443
아이디: adviate
문제: 16727
결과: 맞았습니다!!
메모리:	29200KB 
시간: 72ms
언어: Python 3
코드 길이: 336B
제출한 시간: 2021.09.19 19:14:16
"""

"""
* The first line of the input contains two space-separated integers p1 and s1, where p1 and s1 are the number of goals scored by Persepolis and Esteghlal, respectively, in the first match in which Persepolis is the home team.
  The second line contains two space-separated integers s2 and p2, where s2 and p2 are the number of goals scored by Esteghlal and Persepolis,
  respectively, in the second match in which Esteghlal is the home team. All input integers are between 0 and 20, inclusively.
  
* In the output, print the name of the winning team, either Persepolis or Esteghlal,
  if the winner can be determined by the aggregate scores and the away goals rule. Otherwise, print Penalty.
"""
P1, E1 = map(int, input().split()) # P 홈경기
E2, P2 = map(int, input().split()) # E 홈경기

if((P1+P2) > (E1+E2)) :
    print("Persepolis")
elif((P1+P2) == (E1+E2)) :
    if (P1 < E2) :
        print("Persepolis")
    elif (P1 == E2) :
        print("Penalty") 
    else :
        print("Esteghlal")
else :
    print("Esteghlal")    
