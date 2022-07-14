"""
 * 제출 번호: 46077254
 * ID: adviate
 * 문제: 11508
 * 결과: 맞았습니다!!
 * 메모리: 34692 KB
 * 시간: 132 ms
 * 언어: Python 3
 * 코드 길이: 205 B
"""

import sys
input = sys.stdin.readline

N = int(input())
arr = [int(input()) for _ in range(N)]
arr.sort(reverse=True)

rst = 0
for i in range(len(arr)):
    if i % 3 != 2:
        rst += arr[i]

print(rst)
