#include <iostream>
using namespace std;

int main() {
   
    int a =2, b=5;
    int temp;


    temp = b;
    b = a; 
    a = temp;

    cout<<a<<endl;
    cout<<b;

    return 0;
}