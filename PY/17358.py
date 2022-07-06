"""
 * 제출 번호: 45588087
 * ID: adviate
 * 문제: 17358
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 80 ms
 * 언어: Python 3
 * 코드 길이: 113 B
""" 

ans = 1
mod = pow(10, 9) + 7
N = int(input())

while N > 0:
    ans *= N - 1
    ans %= mod
    N -= 2
print(ans)
