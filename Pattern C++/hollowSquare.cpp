#include <iostream>
using namespace std;

int main(){
    int n;
    cout << "Enter a number: ";
    cin >> n;
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++)
            if(i > 0 && i < n-1){
                if(j == 0 || j == n-1)
                    printf("* ");
                else
                    printf("  ");
            } else {
                printf ("* ");
            }
        cout << endl;
    }
    return 0;
}