"""
제출 번호: 34111992
아이디: adviate
문제: 20233
결과: 맞았습니다!!
메모리:	29200KB 
시간: 72ms
언어: Python 3
코드 길이: 401B
제출한 시간: 2021.10.06 10:09:33


* Since you do not have your own bicycle, you have to rent one. The bike rental allows you to choose one of two monthly options
    The monthly fee is A roubles. Every day, the first 30 minutes are free, and every minute above that costs X roubles.
    The monthly fee is B roubles. Every day, the first 45 minutes are free, and every minute above that costs Y roubles.
    There are 21 working days in November, and you spend T minutes commuting to work and back home in total every day.
    
* The first four lines of the input contain integers A, X, B, and Y (0 <= A, X, B, Y <= 100), each on a separate line.
    The last line contains a single integer T (1 <= T <= 1440) : the total time spent on a bicycle during each day.

* The only line of the output should contain two integers
    the amount of money you would spend on the first option and the second option, respectively.

"""

A = int(input())
X = int(input())

B = int(input())
Y = int(input())

T = int(input())

# A
if(T > 30) :
    # 하루 사용시간 T - 무료 사용시간
    exFeeDay_A = (T - 30)
    # 월 별 사용 요금계산
    ansA = (exFeeDay_A * X * 21) + A

else :
    ansA = A
    
# B
if(T > 45) :
    exFeeDay_B = (T - 45)
    ansB = (exFeeDay_B * Y * 21) + B
    
else :
    ansB = B

print(ansA, ansB)
    
