"""
 * 제출 번호: 48251962
 * ID: adviate
 * 문제: 2090
 * 결과: 맞았습니다!!
 * 메모리: 36756 KB
 * 시간: 140 ms
 * 언어: Python 3
 * 코드 길이: 247 B
"""

import sys
from fractions import Fraction
def ip(): return sys.stdin.readline().rstrip()

N, t = int(ip()), 0
a = list(map(int, ip().split()))
for i in a:
    t += Fraction(1, i)

if N == 1:
    print(f'{a[0]}/{1}')
else:
    print(Fraction(1, t))
