//Message.cpp
#include <iostream>
#include <string>

using namespace std;
#include "Message.h"

	// default constructor
	Message::Message(){
	    author = "";
	    subject = "";
	    body = "";
	}
	
	// Parameterized constructor; 
	Message::Message(const string &athr, const string &sbjct, const string &body){
	    author = athr;
	    subject = sbjct;
	    this->body = body; //this-> ??
	}
	
	//displays Message.
	void Message::display() const{
	    //cout << "---------------------------------------------------------" << endl;
	    cout << subject << endl;
	    cout << "from " << author << ": " << body << endl;
	}