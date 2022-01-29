#ifndef REPLY_H
#define REPLY_H
#include "Message.h"
class Reply:public Message{
public:
    //default constructor
    Reply();
    
    Reply(const string &athr,
          const string &sbjct,
          const string &body,
          unsigned id);
    bool is_reply() const;
    string to_formatted_string() const;
};
#endif
