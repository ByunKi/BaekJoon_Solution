"""
 * 제출 번호: 45012501
 * ID: adviate
 * 문제: 6108
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 76 ms
 * 언어: Python 3
 * 코드 길이: 169 B
"""

N = int(input())
arr = list()

for i in range(N):
    tmp = list(map(int, input().split()))
    tmp.sort()
    arr.append(tmp[int(N/2)])

arr.sort()
print(arr[int(N/2)])
