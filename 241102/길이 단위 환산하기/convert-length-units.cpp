#include <iostream>
using namespace std;

int main() {
    
    double fit =30.48;
    double a;

    cin>> a;
    
    cout<<fixed;
    cout.precision(1);

    a=a*fit;

    cout<<a;


    return 0;
}