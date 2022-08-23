"""
 * 제출 번호: 48192247
 * ID: adviate
 * 문제: 21920
 * 결과: 맞았습니다!!
 * 메모리: 91584 KB
 * 시간: 404 ms
 * 언어: Python 3
 * 코드 길이: 219 B
"""

import sys
from math import gcd
def ip(): return sys.stdin.readline().rstrip()

_ = ip()
A, r = list(map(int, ip().split())), []
x = int(ip())

for i in A:
    if gcd(i, x) == 1:
        r.append(i)
print(sum(r)/len(r))
