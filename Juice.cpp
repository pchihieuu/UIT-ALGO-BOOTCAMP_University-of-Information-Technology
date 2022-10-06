#include <bits/stdc++.h>
using namespace std;
int main(){
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    iso_base::sync_with_stdio(0); cin.tie(0);
    int64_t n, a, b, c, d, ans;
    cin>>n>>a>>b>>c;
    d = b - c;
    if(a<=d) ans = n/a;
        else{
            ans =(n - b)/d+1;
            n-= ans*d;
            ans+=n/a;
        }
    cout<<ans;
}