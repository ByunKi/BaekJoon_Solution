"""
 * 제출 번호: 45066039
 * ID: adviate
 * 문제: 1026
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 182 B
"""

N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

A.sort()
B.sort(reverse=True)

rst = 0
for i in range(N):
    rst += A[i] * B[i]

print(rst)
