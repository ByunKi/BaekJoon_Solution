"""
 * 제출 번호: 49105249
 * ID: adviate
 * 문제: 9417
 * 결과: 맞았습니다!!
 * 메모리: 32952 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 284 B
"""

from sys import stdin
from math import gcd
def ip(): return stdin.readline().rstrip()

for _ in range(int(ip())):
    s = set()
    l = [int(i) for i in ip().split()]
    for i in range(len(l)):
        for j in range(i+1, len(l)):
            s.add(gcd(l[i], l[j]))
    print(max(s))
