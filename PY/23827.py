"""
 * 제출 번호: 49876275
 * ID: adviate
 * 문제: 23827
 * 결과: 맞았습니다!!
 * 메모리: 89468 KB
 * 시간: 272 ms
 * 언어: Python 3
 * 코드 길이: 175 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

_ = int(ip())
l = [int(x) for x in ip().split()]
print((sum(l)**2 - sum([i*i for i in l])) // 2 % 1000000007)
