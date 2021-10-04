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


* Barley the dog loves treats.
    At the end of the day he is either happy or sad depending on the number and size of treats he receives throughout the day. 
    The treats come in three sizes: small, medium, and large. His happiness score can be measured using the following formula:
    1 × S + 2 × M + 3 × L
    where S is the number of small treats, M is the number of medium treats and L is the number of large treats.
    
* There are three lines of input.
    Each line contains a non-negative integer less than 10.
    The first line contains the number of small treats, S,
    the second line contains the number of medium treats, M,
    and the third line contains the number of large treats, L, that Barley receives in a day.
     
*If Barley’s happiness score is 10 or greater, output happy. Otherwise, output sad.
"""

S = int(input())
M = int(input())
L = int(input())

ans = S + 2 * M + 3 * L

if(ans >= 10):
    print("happy")
    
else :
    print("sad")
