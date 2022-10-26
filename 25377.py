"""
 * 제출 번호: 50667337
 * ID: adviate
 * 문제: 25377
 * 결과: 100점
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 228 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

inf = 1000000000
ans = inf
for i in range(int(ip())):
    x, y = map(int, ip().split())
    if x <= y: ans = min(ans, y)
if ans == inf: print(-1)
else: print(ans)
