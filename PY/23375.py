# 제출 번호: 38869094
# 문제: 23375
# 메모리: 30860 KB
# 시간: 68 ms
# 언어: Python3
# 코드 길이: 114 B

x, y = map(int, input().split())
r = int(input())

print(x-r, y+r)
print(x+r, y+r)
print(x+r, y-r)
print(x-r, y-r)
