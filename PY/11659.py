"""
 * 제출 번호: 50847179
 * ID: adviate
 * 문제: 11659
 * 결과: 맞았습니다!!
 * 메모리: 40596 KB
 * 시간: 288 ms
 * 언어: Python 3
 * 코드 길이: 268 B
"""

from sys import stdin
from itertools import accumulate as acc
def ip(): return stdin.readline().rstrip()

N, M = map(int, ip().split())
l = [0] + [i for i in acc(list(map(int, ip().split())))]
for _ in range(M):
    b, e = map(int, ip().split())
    print(l[e]-l[b-1])
