"""
제출 번호: 34033035
아이디: adviate
문제: 15128
결과: 맞았습니다!!
메모리:	29200KB 
시간: 72ms
언어: Python 3
코드 길이: 125B
제출한 시간: 2021.10.04 09:22:50
"""

"""
* A congruent number is an integer
    that is the area of some right triangle where the length of each side of the triangle is a rational number.
    For this problem, we’ll only consider the legs of the right triangle, and not the hypotenuse.
    
* A rational number is a fraction, p/q, where p, the numerator, and q, the denominator, are integers.
    Note that if q = 1, then p/1 is an integer, so any integer is a rational number.
    Given two rational numbers which are the non-hypotenuse legs of a right triangle
    determine if the area of that triangle is a congruent number.
    For the purposes of this problem, it is not necessary for the length of the hypotenuse to be a rational number.
    
* Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. 
    Each test case will consist of a single line with four integers
    p1, q1, p2 and q2 (1 ≤ p1,q1,p2,q2 ≤ 100,000) where p1/q1 and p2/q2 are the rational numbers which are the sides of a right triangle.
    
* Output a single integer, which is 1 if the area of the triangle is an integer, 0 if not. Note that the area has to be an integer, not just a rational number.
"""
P1,Q1,P2,Q2 = map(int, input().split())
# area = (P1/Q1) * (P2/Q2) / 2
# 식을 한번에 처리 하게끔 바꿔 보자
area = (P1 * P2) / (2 * Q1 * Q2)

if(int(area) == area) :
    print(1)
else :
    print(0)
