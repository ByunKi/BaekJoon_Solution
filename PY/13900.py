"""
 * 제출 번호: 49876227
 * ID: adviate
 * 문제: 13900
 * 결과: 맞았습니다!!
 * 메모리: 42132 KB
 * 시간: 104 ms
 * 언어: Python 3
 * 코드 길이: 162 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

_ = int(ip())
l = [int(x) for x in ip().split()]
print((sum(l)**2 - sum([i*i for i in l])) // 2)
