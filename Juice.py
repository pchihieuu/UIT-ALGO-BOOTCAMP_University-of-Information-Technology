import sys
fi = open('input.txt')
fo = open('output.txt','w')
sys.stdin = fi
sys.stdout = fo

n, a, b, c = map(int, input().split())

d = b - c
if a <= d: ans = n // a
else:
    ans = (n - b)//d+1
    n-= ans*d
    ans+= n//a
print(ans)

fo.close()
fi.close()
