"""
 * 제출 번호: 49294511
 * ID: adviate
 * 문제: 5883
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 644 ms
 * 언어: Python 3
 * 코드 길이: 376 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n, c = int(ip()), 1
l = [int(ip()) for _ in range(n)]
a = {}
for i in range(n): a[i] = 0
for i in range(n):
    prev = -1
    for j in range(n):
        if l[i] == l[j]: continue
        if prev == l[j]: c += 1
        else:
            a[j] = max(c, a[j])
            prev = l[j]; c = 1
print(max(a.values()))
