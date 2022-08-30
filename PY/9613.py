"""
 * 제출 번호: 48526087
 * ID: adviate
 * 문제: 9613
 * 결과: 맞았습니다!!
 * 메모리: 32952 KB
 * 시간: 64 ms
 * 언어: Python 3
 * 코드 길이: 276 B
"""

from sys import stdin
from math import gcd
def ip(): return stdin.readline().rstrip()

for _ in range(int(ip())):
    t = 0
    l = [int(x) for x in ip().split()]
    for i in range(1, len(l)):
        for j in range(i+1, len(l)):
            t += gcd(l[i], l[j])
    print(t)
