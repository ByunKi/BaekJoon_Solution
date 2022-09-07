"""
 * 제출 번호: 48855610
 * ID: adviate
 * 문제: 16499
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 156 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n, s = int(ip()), set()
for _ in range(n):
    s.add(''.join(sorted(ip())))

print(len(s))
