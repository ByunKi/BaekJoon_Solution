"""
 * 제출 번호: 45411372
 * ID: adviate
 * 문제: 3135
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 188 B
"""

A, B = map(int, input().split())
arr = [abs(B - int(input())) for _ in range(int(input()))]
cnt = 1
print(cnt + min(abs(A - B)-1, min(arr)))
