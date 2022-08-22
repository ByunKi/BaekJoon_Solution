"""
 * 제출 번호: 48148341
 * ID: adviate
 * 문제: 18294
 * 결과: 맞았습니다!!
 * 메모리: 66396 KB
 * 시간: 244 ms
 * 언어: Python 3
 * 코드 길이: 250 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

dic = {}
N = int(ip())
for _ in range(N):
    e = ip()
    dic[e] = dic[e]+1 if e in dic else 1

N /= 2
t = sorted(dic.items(), key=lambda x: x[1])
print(t[-1][0] if t[-1][1] > N else 'NONE')
