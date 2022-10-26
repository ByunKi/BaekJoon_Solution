"""
 * 제출 번호: 50709488
 * ID: adviate
 * 문제: 25628
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 115 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

A, B = map(int, ip().split())
print(min(A//2, B))
