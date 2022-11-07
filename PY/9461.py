"""
 * 제출 번호: 51441612
 * ID: adviate
 * 문제: 9461
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 196 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

arr = [1, 1, 1] + [0] * 97
for i in range(3, 100): arr[i] = arr[i-3] + arr[i-2]
for _ in range(int(ip())): print(arr[int(ip())-1])
