"""
 * 제출 번호: 45809594
 * ID: adviate
 * 문제: 10825
 * 결과: 맞았습니다!!
 * 메모리: 62880 KB
 * 시간: 4496 ms
 * 언어: Python 3
 * 코드 길이: 220 B
"""

arr = []
for _ in range(int(input())):
    name, K, E, M = input().split()
    arr.append([name, int(K), int(E), int(M)])
arr.sort(key=lambda x: (-x[1], x[2], -x[3], x[0]))

for i in range(len(arr)):
    print(arr[i][0])
