"""
 * 제출 번호: 51666305
 * ID: adviate
 * 문제: 11895
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 183 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n, x = int(ip()), 0
a = list(map(int, ip().split()))
a.sort()

for i in a: x ^= i
print(sum(a)-a[0] if x == 0 else 0)
