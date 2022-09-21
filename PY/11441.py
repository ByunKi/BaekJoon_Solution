"""
 * 제출 번호: 49455234
 * ID: adviate
 * 문제: 11441
 * 결과: 맞았습니다!!
 * 메모리: 40596 KB
 * 시간: 292 ms
 * 언어: Python 3
 * 코드 길이: 261 B
"""

from sys import stdin
from itertools import accumulate as A
def ip(): return stdin.readline().rstrip()

_ = ip()
a = [int(x) for x in ip().split()]
l = [0] + [x for x in A(a)]
for _ in range(int(ip())):
    b, e = map(int, ip().split())
    print(l[e] - l[b-1])
