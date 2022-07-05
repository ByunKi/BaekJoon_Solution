"""
 * 제출 번호: 45562345
 * ID: adviate
 * 문제: 1059
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 329 B
"""

L = int(input())
arr = list(map(int, input().split()))
n = int(input())
arr.sort()

if n in arr:
    print(0)
else:
    min_val = 0
    max_val = 0
    for i in arr:
        if n > i: min_val = i
        elif i > n and max_val == 0: max_val = i
    max_val -= 1
    min_val += 1
    print((n-min_val)*(max_val-n+1) + (max_val-n))
