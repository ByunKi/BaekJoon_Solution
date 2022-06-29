"""
 * 제출 번호: 45187910
 * ID: adviate
 * 문제: 13458
 * 결과: 맞았습니다!!
 * 메모리: 149432 KB
 * 시간: 712 ms
 * 언어: Python 3
 * 코드 길이: 252 B
"""

N = int(input())
A = list(map(int, input().split()))
B, C = map(int, input().split())
cnt = len(A)

for i in A:
    if i - B > 0:
        if (i - B) % C == 0:
            cnt += (i - B) // C
        else:
            cnt += (i - B) // C + 1

print(cnt)
