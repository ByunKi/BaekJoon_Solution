"""
 * 제출 번호: 46851549
 * ID: adviate
 * 문제: 1269
 * 결과: 맞았습니다!!
 * 메모리: 90244 KB
 * 시간: 304 ms
 * 언어: Python 3
 * 코드 길이: 195 B
"""

import sys
input = sys.stdin.readline

lenA, lenB = map(int, input().split())
A = set(map(int, input().split()))
B = set(map(int, input().split()))

AB = A - B
BA = B - A
print(len(AB) + len(BA))
