#include <iostream>
#include <string>
#include <random>
using namespace std;

bool guessComparison(int guess, int answer){
    if(guess == answer){
        return true;
    } else {
        return false;
    }
}

int main(){
    cout << "+++GUESSING GAME+++" << endl << endl;

    int num = rand() % 10;
    cout << num;
    int guess;
    cout << %num << endl;
    int guessCount = 1;

    while(guessComparison(guess, num) == false){
        cout << "Guess " << guessCount << ": ";
        cin >> guess;
        guessCount++;
    }

    if(guessComparison(guess, num) == true){
        cout << "You winnering :3!!!!";
    } else {
        cout << "Kill yourself :3 (and ur mother is so fat)";
    }
}