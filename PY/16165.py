"""
 * 제출 번호: 50093933
 * ID: adviate
 * 문제: 16165
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 413 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
N, M = map(int, ip().split())
for _ in range(N):
    t = ip()
    l = sorted([ip() for _ in range(int(ip()))])
    dic[t] = l

for _ in range(M):
    s = ip()
    q = int(ip())

    if q == 0: print('\n'.join(dic[s]))
    elif q == 1:
        for i in dic.keys():
            if s in dic[i]:
                print(i)
                break
