# 제출 번호: 38866342
# 문제: 20839
# 메모리: 30864 KB
# 시간: 68 ms
# 언어: Python3
# 코드 길이: 299 B

x1, y1, z1 = map(int, input().split())
x2, y2, z2 = map(int, input().split())

if x1 <= x2 and y1 <= y2 and z1 <= z2:
    print('A')
elif x1/2 <= x2 and y1 <= y2 and z1 <= z2:
    print('B')
elif y1 <= y2 and z1 <= z2:
    print('C')
elif y1/2 <= y2 and z1 <= z2:
    print('D')
else:
    print('E')
