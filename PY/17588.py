"""
 * 제출 번호: 45357298
 * ID: adviate
 * 문제: 17588
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 214 B
"""

n = int(input())
flag = True
arr = [int(input()) for _ in range(n)]
arr.sort()

for i in range(1, max(arr) + 1):
    if not arr.__contains__(i):
        flag = False
        print(i)

if flag:
    print("good job")
