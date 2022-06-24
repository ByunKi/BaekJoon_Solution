'''
 * 제출 번호: 44974259
 * ID: adviate
 * 문제: 5939
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 276 ms
 * 언어: Python 3
 * 코드 길이: 298 B
'''

from operator import itemgetter

N = int(input())
arr = list()
for i in range(N):
    arr.append(list(map(int, input().split())))

for i in range(2, -1, -1):
    arr = sorted(arr, key=itemgetter(i), reverse=False)

for i in range(N):
    print("{0} {1} {2}".format(arr[i][0], arr[i][1], arr[i][2]))
