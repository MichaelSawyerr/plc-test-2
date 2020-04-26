#include<iostream>
#include<string>
#include<stdlib.h>

using namespace std;
enum Draft { FirstRound = 1, SecondRound = 30, Undrafted = 61 };
enum NbaOrGLeague{ NBA = 1, NFL };
void Draft(int Round);

int main() {

	while (true) {

		NbaOrGLeague Converter;
		int pick, league, Round;

		cout << "Choose a league : " << endl;
		cout << "Enter " << NBA << " -- NBA to NFL" << endl;
		cout << "Enter " << NFL << " -- NFL to NBA" << endl;
		cout << "League :";
		cin >> league;
		switch (league) {

			case NBA:
			cout << "Which NBA pick: ";
			cin >> pick;
			Round = (pick * 5) + 10;
			cout << "NFL is " << Round << endl;
				Draft(pick);
					break;

				case NFL:
		cout << "Which NFL pick : ";
		cin >> pick;
		Round = (pick *10) + 10;
		cout << "NBA is " << Round << endl;
	Draft(Round);
	break;

	default:
	cout << "Invalid Option" << endl;
		exit(0);
			break;
		}
		}
	}

		void Draft(int Round) {
			string result;

			Round <= FirstRound ? result = "First Rounder" : "";
			Round > FirstRound && Round <= SecondRound ? result = "First Rounder" : "";
			Round > SecondRound && Round <= Undrafted ? result = "Second Rounder" : "";
			Round > Undrafted ? result = "Sorry Undrafted" : "";
			cout << result << endl;

	}
