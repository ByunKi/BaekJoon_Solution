"""
 * 제출 번호: 51571444
 * ID: adviate
 * 문제: 21921
 * 결과: 맞았습니다!!
 * 메모리: 62196 KB
 * 시간: 260 ms
 * 언어: Python 3
 * 코드 길이: 401 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
N, X = map(int, ip().split())
a = list(map(int, ip().split())) + [0]
if max(a) == 0: print('SAD')
else:
    n = sum(a[0:X])
    dic[n] = 1

    for i in range(1, N):
        if X+i <= N:
            n = n - a[i-1] + a[i+X-1]
            dic[n] = dic[n]+1 if n in dic else 1

    k = max(dic.keys())
    print(k); print(dic[k])
