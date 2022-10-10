"""
 * 제출 번호: 50367516
 * ID: adviate
 * 문제: 25644
 * 결과: 맞았습니다!!
 * 메모리: 52336 KB
 * 시간: 188 ms
 * 언어: Python 3
 * 코드 길이: 217 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n, m, a = int(ip()), 10000000000, []
l = list(map(int, ip().split()))
for i in range(n):
    if l[i] < m: m = l[i]
    a.append(l[i] - m)
print(max(a))
