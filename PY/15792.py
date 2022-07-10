"""
 * 제출 번호: 45851044
 * ID: adviate
 * 문제: 15792
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 152 B
"""

A, B = map(int, input().split())
rst = (str(A // B) + ".")
A = (A % B) * 10

for _ in range(1000):
    rst += str(A//B)
    A = (A % B) * 10

print(rst)
