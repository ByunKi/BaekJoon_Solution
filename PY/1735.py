"""
 * 제출 번호: 49441703
 * ID: adviate
 * 문제: 1735
 * 결과: 맞았습니다!!
 * 메모리: 36756 KB
 * 시간: 140 ms
 * 언어: Python 3
 * 코드 길이: 234 B
"""

from sys import stdin
from fractions import Fraction as F
def ip(): return stdin.readline().rstrip()

l = [list(map(int, ip().split())) for i in range(2)]
a = F(l[0][0], l[0][1]) + F(l[1][0], l[1][1])
print(a.numerator, a.denominator)
