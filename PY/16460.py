_, gp, gd = input().split()
N = int(input())
arr = [list(input().split()) for _ in range(N)]
names = []

for i in arr:
    if len(gp) > 1:
       if int(gd) >= int(i[2]):
           names.append(i[0])
    else:
        if len(i[1]) > 1:
            i[1] = ['F', 'M']

        if gp in i[1] and int(gd) >= int(i[2]):
            names.append(i[0])

names.sort()
print('No one yet' if len(names) == 0 else '\n'.join(names))
