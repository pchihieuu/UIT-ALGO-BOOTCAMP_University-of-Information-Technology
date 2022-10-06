import sys
fi = open('input.txt')
fo = open('output.txt')
sys.stdin = fi
sys.stdout = fo

n, a, b =map(int, input().split())
c = (b<<1)//n*n

if c <= (a<<1) : x, y = a, a
elif c >= a + b: x, y =b, c-b
else: x, y = c-a, a
print(x, y)

fo.close()
fi.close()
