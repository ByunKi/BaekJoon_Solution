"""
제출 번호: 34069104
아이디: adviate
문제: 19602
결과: 맞았습니다!!
메모리:	29200KB 
시간: 72ms
언어: Python 3
코드 길이: 139B
제출한 시간: 2021.10.05 08:33:52


* each person receives a quota of 60 liters per month in a fuel card.
    Each liter of petrol costs 1500 Oshloobs if it is within quota.
    Any extra fueling costs 3000 Oshloobs per liter.
    
* The input consists of two lines.
     The first line contains an integer n (0 ⩽ n ⩽ 200), specifying the amount of petrol that will be used in the next month.
     The second line contains an integer k (0 ⩽ k ⩽ 360), showing the quota left in Mahya’s fuel card at the end of current month.
     
* Print the amount of money (in Oshloobs) that Mahya will pay for petrol in the next month.
"""

S = int(input())
M = int(input())
L = int(input())

ans = S + 2 * M + 3 * L

if(ans >= 10):
    print("happy")
    
else :
    print("sad")
