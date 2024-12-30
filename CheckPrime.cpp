//Boo!!

#include <iostream>
#include <string>
using namespace std;

bool isPrimeCheck(int n) {
    if (n <= 1) {
        return false;
    }

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}

int main() {
    cout << "CHECK FOR PRIME";
    cout << "\n\nNumber n: ";
    int n;
    cin >> n;

    bool isPrimeResult = isPrimeCheck(n);

    if (isPrimeResult) {
        cout << "The given number n is a prime number.";
    } else {
        cout << "The given number n is not a prime number.";
    }

    return 0;
}