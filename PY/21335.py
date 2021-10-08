"""
제출 번호: 34192567
아이디: adviate
문제: 21631
결과: 맞았습니다!!
메모리:	31312KB 
시간: 68ms
언어: Python 3
코드 길이: 123B
제출한 시간: 2021.10.08 11:07:57


*  Scientists have estimated the total amount of gas emitted, which, due to lack of wind, has spread out uniformly across a circular area around the centre of the volcano.
    The authorities have evacuated the area, and would now like to close it off by surrounding the perimeter with barrier tape.
    
* One line with an integer a (1 <= a <= 10^{18}), the total area covered by gas in square metres.

* Output the total length of barrier tape needed to surround the area covered by gas, in metres.
    Your answer should have an absolute or relative error of at most $10^{-6}$.

"""

import math

area = int(input())
radius = area / math.pi
radius = math.sqrt(radius)

rst = radius * 2 * math.pi

print(rst)
