"""
 * 제출 번호: 49722932
 * ID: adviate
 * 문제: 1448
 * 결과: 맞았습니다!!
 * 메모리: 82496 KB
 * 시간: 872 ms
 * 언어: Python 3
 * 코드 길이: 253 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

N = int(ip())
v = sorted([int(ip()) for _ in range(N)], reverse=True)

for i in range(N - 2):
    if v[i] < v[i+1] + v[i+2]:
        print(v[i] + v[i+1] + v[i+2])
        quit()
print(-1)
