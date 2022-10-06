#include <bits/stdc++.h>
using namespace std;

int main(){
    freopen("input.txt", "r", stdin);
    freopen("ouput.txt", "w", stdout);
    ios_base::sync_with_stdio(0); cin.tie(0);

    int n, a, b, c, x, y;
    cin>>n>>a>>b;
    c = (b<<1)/n*n;
    if(c<= (a<<1)) x= a, y =a;
        else
            if(c >= a+b) x = b, y = c- b;
                else x = c - a, y = a;
    cout<<x<' '<<y;
}