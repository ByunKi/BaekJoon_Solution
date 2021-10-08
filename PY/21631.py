"""
제출 번호: 34192012
아이디: adviate
문제: 21631
결과: 맞았습니다!!
메모리:	29200KB 
시간: 80ms
언어: Python 3
코드 길이: 116B
제출한 시간: 2021.10.08 10:48:50


* Each piece he has is either white or black. Dima builds a tower by stacking his pieces on top of each other in some order.
    A black stripe is a sequence of adjacent black pieces, with either a white piece, or the end of the tower at the bottom and top of it.
    The goal of the game is to get the maximum number of black stripes in the tower.
    
* The only line of input contains two integers
    The number of white and black pieces, respectively (0 <= a, b <= 10^{18}).

* Output a single integer
    The maximum possible number of black stripes.

"""

a,b = map(int, input().split())

if(a >= b) :
    rst = b
    
elif (a <= b) :
    rst = (a + 1)
# 검정색 +1

print(rst)
