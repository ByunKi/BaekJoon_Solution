"""
 * 제출 번호: 51167765
 * ID: adviate
 * 문제: 2512
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 88 ms
 * 언어: Python 3
 * 코드 길이: 298 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N = int(ip())
a = list(map(int, ip().split()))
L = int(ip())

b, e = 1, max(a)
while b <= e:
    m = (b+e)//2
    r = 0
    for i in a:
        if m <= i: r += m
        else: r += i
    if r <= L: b = m+1
    else: e = m-1
print(e)
