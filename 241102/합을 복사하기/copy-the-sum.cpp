#include <iostream>
using namespace std;

int main() {
    
    int a=1, b=2, c=3;

    a=b=c=c+a+b;

    cout<<a<<" "<<b<<" "<<c;

    return 0;
}