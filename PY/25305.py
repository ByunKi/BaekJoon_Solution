"""
 * 제출 번호: 45458095
 * ID: adviate
 * 문제: 25305
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 112 B
"""

N, k = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort(reverse=True)

print(arr[k - 1])
