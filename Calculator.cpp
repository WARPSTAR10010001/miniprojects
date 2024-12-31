//Boo!!

#include <iostream>
#include <string>
using namespace std;

void printResult(double result){
    cout<<endl<<"The result is: "<<result<<".";
}

void addition(double n1, double n2){
    printResult(n1+n2);
}

void subtraction(double n1, double n2){
    printResult(n1-n2);
}

void multiplication(double n1, double n2){
    printResult(n1*n2);
}

void division(double n1, double n2){
    printResult(n1/n2);
}

int main(){
    cout<<"+++CALCULATOR+++\n\n";

    cout<<"Enter 1st number: ";
    double n1;
    cin>>n1;

    cout<<"Enter operation: ";
    char operation;
    cin>>operation;

    cout<<"Enter 2nd number: ";
    double n2;
    cin>>n2;

    switch (operation){
        case '+':
        addition(n1, n2);
        break;
        case '-':
        subtraction(n1, n2);
        break;
        case '*':
        multiplication(n1, n2);
        break;
        case '/':
        division(n1, n2);
        break;
        default:
        cout<<"Invalid operator.";
    }

    return 0;
}