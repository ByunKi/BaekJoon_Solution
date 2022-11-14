"""
 * 제출 번호: 51708888
 * ID: adviate
 * 문제: 23330
 * 결과: 맞았습니다!!
 * 메모리: 88092 KB
 * 시간: 548 ms
 * 언어: Python 3
 * 코드 길이: 200 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n, s = int(ip()), 0
a = sorted(list(map(int, ip().split())), reverse=True)
for i in range(n):
    s += a[i] * 2 * (n-1-(2*i))
print(s)
