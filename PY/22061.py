"""
 * 제출 번호: 45070036
 * ID: adviate
 * 문제: 22061
 * 결과: 맞았습니다!!
 * 메모리: 116736 KB
 * 시간: 4880 ms
 * 언어: PyPy3
 * 코드 길이: 176 B
"""

for _ in range(int(input())):
    a, b, c = list(map(int, input().split()))

    if a + 2 * b < c or (a == 0 and c % 2 == 1):
        print("NO")
    else:
        print("YES")
