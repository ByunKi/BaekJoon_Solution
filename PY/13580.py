# 제출 번호: 38864671
# 문제: 13580
# 메모리: 30864 KB
# 시간: 76 ms
# 언어: Python3
# 코드 길이: 176 B

list = list(map(int, input().split()))
list = sorted(list)

if (list[0] == list[1] or list[1] == list[2] or list[0] + list[1] == list[2]) :
    print("S")
else :
    print("N")
