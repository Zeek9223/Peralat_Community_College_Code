//include header files
#include "User.h"
#include <string>
#include <iostream>
#include <stdio.h>
using namespace std;
//constructor
User::User()
{
    username = "";
    password = "";
}

// Parameter constructor
User::User(const string& uname, const string& pass)
{
    username = uname;
    password = pass;
}

//Implement the getters and setter method
string User::getUsername() const
{
    return username;
}

//Implement method to check
bool User::check(const string &uname, const string &pass) const
{
    if (uname == "")
    {
        return false;
    }
    else if (pass == "")
    {
        return false;
    }
    else if (username == uname)
    {
        if (password == pass)
        {
            return true;
        }
    }
    else
        return false;
    return false;
}

//implement method to set the password
bool User::setPassword(const string &oldpass, const string &newpass)
{
    password = newpass;
    return true;
}
