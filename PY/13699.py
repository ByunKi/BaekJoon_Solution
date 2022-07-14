"""
 * 제출 번호: 46077578
 * ID: adviate
 * 문제: 13699
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 355 B
"""

import sys
input = sys.stdin.readline

def calc(array, num):
    if array[num] == 0:
        for i in range(num):
            array[num] += calc(array, i) * calc(array, num - 1 - i)
        return array[num]
    else:
        return array[num]

n = int(input())
arr = [0 for _ in range(36)]
arr[0] = 1
arr[1] = 1
arr[2] = 2
arr[3] = 5

print(calc(arr, n))
