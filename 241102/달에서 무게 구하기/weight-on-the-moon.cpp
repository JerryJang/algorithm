#include <iostream>

using namespace std;

int main() {

    cout<<fixed;

    int a = 13;

    double b = 0.165000;

    cout<<a<<" * ";

    cout.precision(6);
    cout<<b;
    
    cout<<" = "<<a*b;


    return 0;
}