"""
 * 제출 번호: 45186831
 * ID: adviate
 * 문제: 8974
 * 결과: 맞았습니다!!
 * 메모리: 34908 KB
 * 시간: 128 ms
 * 언어: Python 3
 * 코드 길이: 171 B
"""

import sys

A, B = list(map(int, sys.stdin.readline().split()))
arr = list()

for i in range(1, 1001):
    for _ in range(i):
        arr.append(i)

print(sum(arr[A-1:B]))
