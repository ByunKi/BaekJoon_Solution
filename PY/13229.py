"""
 * 제출 번호: 48040057
 * ID: adviate
 * 문제: 13229
 * 결과: 맞았습니다!!
 * 메모리: 32404 KB
 * 시간: 2596 ms
 * 언어: Python 3
 * 코드 길이: 245 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

_ = int(ip())
arr = list(map(int, ip().split()))
r = []

for _ in range(int(ip())):
    b, e = map(int, ip().split())
    total = sum(arr[b:e+1])
    r.append(total)

print(*r, sep='\n')
