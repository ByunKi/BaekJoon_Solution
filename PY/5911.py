"""
 * 제출 번호: 51255959
 * ID: adviate
 * 문제: 5911
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 440 ms
 * 언어: Python 3
 * 코드 길이: 480 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N, B = map(int, ip().split())
p, s, arr = [], [], [0]*N
for _ in range(N):
    t = list(map(int, ip().split()))
    p.append(t[0]); s.append(t[1])

r = 0
for i in range(N):
    for j in range(N):
        if i == j: arr[j] = (p[j] // 2) + s[j]
        else: arr[j] = p[j] + s[j]

    arr.sort()
    tmp, c = 0, 0
    for j in arr:
        tmp += j
        if tmp > B: break
        c += 1
    r = max(r, c)
print(r)
