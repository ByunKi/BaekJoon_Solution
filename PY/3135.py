"""
 * 제출 번호: 45411535
 * ID: adviate
 * 문제: 3135
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 130 B
"""

A, B = map(int, input().split())
arr = [abs(B - int(input())) for _ in range(int(input()))]
print(1 + min(abs(A - B)-1, min(arr)))
