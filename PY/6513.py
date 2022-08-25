"""
제출 번호: 48302072
아이디: adviate
문제: 6513
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 72 ms
언어: Python 3
코드 길이: 701 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

def is_vowel(c):
    if c == 'a' or c == 'e' or  c == 'i' or c == 'o' or c == 'u':
        return True
    return False

dic, a = {}, []
L, N = map(int, ip().split())
for _ in range(L):
    tmp = ip().split()
    dic[tmp[0]] = tmp[1]

for _ in range(N):
    s = ip()
    if s in dic:
        a.append(dic[s])
    else:
        if s[-1] == 'y' and not is_vowel(s[-2]):
            a.append(s[:-1] + 'ies')
        else:
            if s[-1] == 'o' or s[-1] == 's' or s[-1] == 'x' or s[-2:] == 'ch' or s[-2:] == 'sh':
                a.append(s + 'es')
            else:
                a.append(s + 's')
            
print('\n'.join(a))
