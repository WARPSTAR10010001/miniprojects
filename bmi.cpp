#include <iostream>
#include <string>
#include <cmath>
using namespace std;

double bmi(){
    double height;
    cout<<"Enter height [m]: ";
    cin>>height;
    
    double weight;
    cout<<"Enter weight [kg]: ";
    cin>>weight;
    
    return weight / (height * height);
}

int main() {
    cout<<"Passcode (the passcode is 1 lmao): ";
    int selection;
    cin>>selection;
    
    if(selection == 1){
        cout<<endl;
        double bmiResult;
        bmiResult = bmi();
        cout<<"Your BMI is: "<<bmiResult<<".";
    } else {
        cout<<"erm what the sigma";
    }
    
    return 0;
}