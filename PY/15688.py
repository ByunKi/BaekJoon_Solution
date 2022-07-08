"""
 * 제출 번호: 45713403
 * ID: adviate
 * 문제: 15688
 * 결과: 맞았습니다!!
 * 메모리: 82496 KB
 * 시간: 24548 ms
 * 언어: Python 3
 * 코드 길이: 140 B
"""

import sys
input = sys.stdin.readline

N = int(input())
arr = [int(input()) for _ in range(N)]
arr = sorted(arr)

for i in arr:
    print(i)
