"""
제출 번호: 34033257
아이디: adviate
문제: 16693
결과: 맞았습니다!!
메모리:	31312KB 
시간: 76ms
언어: Python 3
코드 길이: 205B
제출한 시간: 2021.10.04 09:45:55
"""

"""
* There’s a pizza store which serves pizza in two sizes: either a pizza slice,
    with area A1 and price P1, or a circular pizza, with radius R1 and price P2.
    You want to maximize the amount of pizza you get per dollar. Should you pick the pizza slice or the whole pizza?
    
* The first line contains two space-separated integers A1 and P1.
    Similarly, the second line contains two space-separated integers R1 and P2.
    It is guaranteed that all values are positive integers at most 10^3.
    We furthermore guarantee that the two will not be worth the same amount of pizza per dollar.

    
* If the better deal is the whole pizza, print ‘Whole pizza’ on a single line.
    If it is a slice of pizza, print ‘Slice of pizza’ on a single line.
"""
import math

A1,P1 = map(int, input().split())
R2,P2 = map(int, input().split())
circleArea = math.pi * R2 ** 2

if(circleArea / P2 > A1 / P1) :
    print("Whole pizza")
else :
    print("Slice of pizza")
