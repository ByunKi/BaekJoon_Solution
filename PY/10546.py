"""
 * 제출 번호: 48758879
 * ID: adviate
 * 문제: 10546
 * 결과: 맞았습니다!!
 * 메모리: 43644 KB
 * 시간: 208 ms
 * 언어: Python 3
 * 코드 길이: 273 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

dic = {}
N = int(ip())
for _ in range(N):
    n = ip()
    dic[n] = dic[n]+1 if n in dic else 1

for _ in range(N-1):
    n = ip()
    dic[n] -= 1

for i in dic:
    if dic[i]:
        print(i)
        break
