#include <iostream>
#include<string>
#include<stdlib.h>
using namespace std;

void Draft(int round);
int main() {
while (true) {

int pick, league, round;

cout << "----------------------------------" << endl;
cout << "Please enter the league : " << endl;
cout << "Enter 1 -- convert from NBA to NFL" << endl;
cout << "Enter 2 -- convert from NFL to NBA" << endl;
cout << "League :";
cin >> league;

switch (league) {
case 1:
cout << "Please enter the NBA pick : ";
cin >> pick;

round = (pick * 5) + 10;
cout << "NFL is " << round << endl;

Draft(pick);
break;

case 2:
cout << "Please enter the NFL pick : ";
cin >> pick;
round = (pick * 10) + 10;

cout << "NBA is " << round << endl;
Draft(round);
break;

default:
cout << "Wrong Input" << endl;
exit(0);

break;
}
}
}

void Draft(int round) {
string result;
round <= 15 ? result = "Lottery Pick" : "";
round > 15 && round <= 30 ? result = "First Rounder" : "";
round > 30 && round <= 60 ? result = "Second Rounder" : "";
round > 60 ? result = "Sorry Undrafted" : "";

cout << result << endl;

}
