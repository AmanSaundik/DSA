#include <iostream>
using namespace std;

int main(){
    int m,n;
    cout << "Enter the length of Rectangle: ";
    cin >> m;
    cout << "Enter the breadth of Rectangle: ";
    cin >> n;
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++)
            cout << "* ";
        cout << endl;
    }
    return 0;
}