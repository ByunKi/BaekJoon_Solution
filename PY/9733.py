"""
 * 제출 번호: 46725058
 * ID: adviate
 * 문제: 9733
 * 결과: 맞았습니다!!
 * 메모리: 30840 KB
 * 시간: 64 ms
 * 언어: Python 3
 * 코드 길이: 374 B
"""

import sys
input = sys.stdin.readlines

total = 0
dic = {'Re': 0, 'Pt': 0, 'Cc': 0, 'Ea': 0, 'Tb': 0, 'Cm': 0, 'Ex': 0}
for i in input():
    tmp = list(i.split())
    for j in tmp:
        if j in dic:
            dic[j] = dic.get(j, 0) + 1
        total += 1

for i in dic:
    print(i, dic.get(i), '{:.2f}'.format(dic.get(i) / total))
print('Total {} 1.00'.format(total))
