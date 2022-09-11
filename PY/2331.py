"""
 * 제출 번호: 49003483
 * ID: adviate
 * 문제: 2331
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 307 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def F(a, p):
    r = 0
    while a > 0:
        r += (a % 10) ** p
        a //= 10
    return r

A, P = map(int, ip().split())
l, i = [A], 0
while 1:
    n = F(l[-1], P)
    if n in l:
        print(l.index(n))
        break
    l.append(n)
