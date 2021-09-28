"""
제출 번호: 33811280
아이디: adviate
문제: 18005
결과: 맞았습니다!!
메모리:	29200KB 
시간: 64ms
언어: Python 3
코드 길이: 127B
제출한 시간: 2021.09.28 11:45:06
"""

"""
* Your friend has secretly picked n consecutive positive integers between 1 and 1018
    and wants you to guess if their sum is even or odd.
    If the sum must be even, write 2.
    If the sum must be odd, write 1.
    If the sum could be even or could be odd, write 0.

   
* The single line of input contains a single integer n (1 ≤ n ≤ 109).

* Output 2 if the sum of any n consecutive integers in the range from 1 to 1018 must be even, 1
    if the sum must be odd, or 0 if the sum could be either even or odd.
"""
N = int(input())

if(N % 2 == 1) :
    print(0)
else :
    if((N // 2) % 2 == 0) :
        print(2)
    else :
        print(1)
