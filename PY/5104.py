"""
제출 번호: 47785111
아이디: adviate
문제: 5104
결과: 맞았습니다!!
메모리: 30840 KB 
시간: 76 ms
언어: Python 3
코드 길이: 531 B
"""

from sys import stdin
def ip(): return stdin.readline().rstrip()

t = {'TT':75, 'TX':50, 'PR':80, 'RT':30, 'AP':25, 'PX':60}

while 1:
    W, N = map(int, ip().split())
    if W == 0 and N == 0:
        break

    dic, names = {}, []
    for _ in range(N):
        name, code = ip().split()
        dic[name] = t[code] + dic[name] if name in dic else t[code]
        
    for k, v in dic.items():
        if v >= 100: names.append(k)

    print(f'Week {W} ', end='')
    print(','.join(names) if names else 'No phones confiscated')
