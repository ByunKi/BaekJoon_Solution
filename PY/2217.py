"""
 * 제출 번호: 45953214
 * ID: adviate
 * 문제: 2217
 * 결과: 맞았습니다!!
 * 메모리: 34692 KB
 * 시간: 4020 ms
 * 언어: Python 3
 * 코드 길이: 148 B
"""

N = int(input())
arr = [int(input()) for _ in range(N)]
arr.sort(reverse=True)

for i in range(len(arr)):
    arr[i] = arr[i]*(i+1)

print(max(arr))
