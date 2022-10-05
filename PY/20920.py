"""
 * 제출 번호: 50147967
 * ID: adviate
 * 문제: 20920
 * 결과: 맞았습니다!!
 * 메모리: 60588 KB
 * 시간: 380 ms
 * 언어: Python 3
 * 코드 길이: 318 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
N, M = map(int, ip().split())
for _ in range(N):
    s = ip()
    dic[s] = dic[s] + 1 if s in dic else 1

l = sorted(list(dic.items()), key=lambda x: (-x[1], -len(x[0]), x[0]))
for i in l:
    if len(i[0]) < M:
        continue
    print(i[0])
