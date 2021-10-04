"""
제출 번호: 34069306
아이디: adviate
문제: 20352
결과: 맞았습니다!!
메모리:	31312KB 
시간: 76ms
언어: Python 3
코드 길이: 89B
제출한 시간: 2021.10.05 08:57:14


* To build this wall, enough fencing will be needed to cover a length equal to the perimeter of the circular tent.
    How many metres will you need to obtain?

* The input consists of: One line with an integer 
    a (1 <= a <= 10^{18}), the area of the circus tent in square metres.
     
* Output the total length of fence needed for the circus palisade wall, in metres.
    Your answer should have an absolute or relative error of at most 10^{-6}.
"""

import math

a = float(input())

a /= math.pi
a = math.sqrt(a)
a *= 2 * math.pi

print(a)
