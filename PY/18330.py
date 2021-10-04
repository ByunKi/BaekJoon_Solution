"""
제출 번호: 34069054
아이디: adviate
문제: 18330
결과: 맞았습니다!!
메모리:	29200KB 
시간: 68ms
언어: Python 3
코드 길이: 257B
제출한 시간: 2021.10.05 08:24:52


* each person receives a quota of 60 liters per month in a fuel card.
    Each liter of petrol costs 1500 Oshloobs if it is within quota.
    Any extra fueling costs 3000 Oshloobs per liter.
    
* The input consists of two lines.
     The first line contains an integer n (0 ⩽ n ⩽ 200), specifying the amount of petrol that will be used in the next month.
     The second line contains an integer k (0 ⩽ k ⩽ 360), showing the quota left in Mahya’s fuel card at the end of current month.
     
* Print the amount of money (in Oshloobs) that Mahya will pay for petrol in the next month.
"""

A = int(input()) # 다음 달에 사용할 휘발유의 양
B = int(input()) # 잔여 할당
C = 60 # 다음 달에 사용 할 수 있는 휘발유 의 양
ans = 0

if(B + C >= A):
    print(A * 1500)
else :
    print((A - (B + C)) * 3000 + (B + C) * 1500)
