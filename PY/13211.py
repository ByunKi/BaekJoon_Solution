"""
 * 제출 번호: 48349629
 * ID: adviate
 * 문제: 13211
 * 결과: 맞았습니다!!
 * 메모리: 41084 KB
 * 시간: 188 ms
 * 언어: Python 3
 * 코드 길이: 194 B
"""

import sys
def ip(): return sys.stdin.readline().rstrip()

s, cnt = set(), 0
for _ in range(int(ip())):
    s.add(ip())

for _ in range(int(ip())):
    if ip() in s:
        cnt += 1

print(cnt)
