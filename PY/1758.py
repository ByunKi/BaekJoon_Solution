"""
 * 제출 번호: 46076784
 * ID: adviate
 * 문제: 1758
 * 결과: 맞았습니다!!
 * 메모리: 34692 KB
 * 시간: 4648 ms
 * 언어: Python 3
 * 코드 길이: 167 B
"""

N = int(input())
arr = [int(input()) for _ in range(N)]
arr.sort(reverse=True)

rst = 0
for i in range(N):
    if arr[i] - i > 0:
        rst += arr[i] - i

print(rst)
