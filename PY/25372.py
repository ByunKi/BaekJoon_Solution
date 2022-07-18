"""
 * 제출 번호: 46220185
 * ID: adviate
 * 문제: 25372
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 108 ms
 * 언어: Python 3
 * 코드 길이: 106 B
"""

arr = [input() for _ in range(int(input()))]

for i in arr:
    print("yes" if 6 <= len(i) <= 9 else "no")
