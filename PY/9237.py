"""
 * 제출 번호: 45562960
 * ID: adviate
 * 문제: 9237
 * 결과: 맞았습니다!!
 * 메모리: 42240 KB
 * 시간: 124 ms
 * 언어: Python 3
 * 코드 길이: 147 B
"""

N = int(input())
arr = list(map(int, input().split()))
arr.sort(reverse=True)

for i in range(len(arr)):
    arr[i] += (i + 1)

print(max(arr) + 1)
