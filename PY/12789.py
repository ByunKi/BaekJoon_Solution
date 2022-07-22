"""
 * 제출 번호: 46500040
 * ID: adviate
 * 문제: 12789
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 384 B
"""

import sys
input = sys.stdin.readline

N, tmp = int(input()), 1
arr = list(map(int, input().split()))
stack = []

while arr:
    if arr[0] == tmp:
        tmp += 1
        arr.pop(0)
    else:
        stack.append(arr.pop(0))

    while stack:
        if stack[-1] == tmp:
            stack.pop()
            tmp += 1
        else:
            break


print("Sad" if stack else "Nice")
