"""
 * 제출 번호: 49200955
 * ID: adviate
 * 문제: 2417
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 192 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

n, s = int(ip()), 0
e = n
while s <= e:
    mid = (s + e) // 2
    if mid ** 2 < n: s = mid + 1
    else: e = mid - 1
print(s)
