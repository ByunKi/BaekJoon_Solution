"""
제출 번호: 34152324
아이디: adviate
문제: 20353
결과: 맞았습니다!!
메모리:	31312KB 
시간: 76ms
언어: Python 3
코드 길이: 71B
제출한 시간: 2021.10.06 09:34:35


* The atrium of a traditional Roman dormus is a perfectly square room designed for residents and guests to congregate in and to enjoy the sunlight streaming in from above.
    A major problem with traditional Roman architecture, particularly in modern times, is the absence of any kind of effective walls between rooms.
    You have arrived in Italy and now you are going to helpfully rebuild the walls on behalf of the authorities, starting with the atrium of a particularly derelict building you found.
     # a perfectly square room
     # square round
     
* The input consists of a single integer a (1 ≤ a ≤ 10^18), the area in square meters of the Atrium.

* Output the total length of walling needed for the atrium, in metres.
    The length should be accurate to an absolute or relative error of at most 10−6.

"""
import math

area = int(input())
side = math.sqrt(area)

print(4 * side)
