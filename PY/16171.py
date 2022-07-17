"""
 * 제출 번호: 46175993
 * ID: adviate
 * 문제: 16171
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 72 ms
 * 언어: Python 3
 * 코드 길이: 111 B
"""

S, K = list(input()), str(input())
tmp = ''.join([i for i in S if not i.isdigit()])
print(1 if K in tmp else 0)
