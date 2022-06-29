"""
 * 제출 번호: 45234282
 * ID: adviate
 * 문제: 5635
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 68 ms
 * 언어: Python 3
 * 코드 길이: 208 B
"""

arr = []
n = int(input())

for _ in range(n):
    name, d, m, y = input().split()
    arr.append([name, int(d), int(m), int(y)])

arr.sort(key=lambda x: (x[3], x[2], x[1]))

print(arr[-1][0])
print(arr[0][0])
