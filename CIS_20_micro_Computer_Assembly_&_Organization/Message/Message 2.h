#ifndef __MESSAGE_H__
#define __MESSAGE_H__

//include required header files
#include <string>
using namespace std;
//create class Message
class Message
{
    //declare variables
private:
    string author;
    string subject;
    string body;
    
public:
    //default constructor
    Message();
    
    //Constructor with parameters
    Message(const string &athr,
            const string &sbjct,
            const string &body);
    
    //displays the message in the given format
    // Displays the Message using the following format:
    //
    // subject
    // from author: body
    void display() const;
};
#endif
