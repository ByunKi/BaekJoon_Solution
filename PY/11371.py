"""
 * 제출 번호: 45411570
 * ID: adviate
 * 문제: 11371
 * 결과: 맞았습니다!!
 * 메모리: 32952 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 166 B
"""

from math import *

while True:
    x, y = map(int, input().split())
    if x == 0 and y == 0:
        break

    deg = (atan2(y, x) * 180) / pi
    print(round(deg))
