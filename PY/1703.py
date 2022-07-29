"""
 * 제출 번호: 46888427
 * ID: adviate
 * 문제: 1703
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 258 B
"""

import sys
input = sys.stdin.readline

while True:
    arr = list(map(int, input().split()))
    if arr[0] == 0:
        break

    tmp = 1
    for i in range(arr[0]):
        a = arr[2 * i + 1]
        b = arr[2 * i + 2]
        tmp = tmp*a-b
    print(tmp)
