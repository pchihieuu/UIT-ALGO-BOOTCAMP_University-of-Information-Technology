import sys
fi = open('input.txt')
fo = open('output.txt', 'w')
sys.stdin = fi
sys.stdout = fo

n = int(input())
a = [int(i) for i in input().split()]
s = set()
for i in a:
    if i in s: print('1',end=' ')
    else:
        print('0', end=' ')
        s.add(i)
fo.close()
fi.close()


