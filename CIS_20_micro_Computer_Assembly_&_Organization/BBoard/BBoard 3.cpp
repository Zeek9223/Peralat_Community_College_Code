#include <iostream>
#include <fstream>
#include <cstdlib>
#include "BBoard.h"

//PUBLIC//

//constructor that creates a board with a default title, empty user &
//message lists, and the "default" User
BBoard::BBoard()
{
    title = "Rica's Board!";
    user_list.clear();
    current_user = User();
    message_list.clear();
}

//same as default constructor, except that it sets the title of the board.
BBoard::BBoard(const string &ttl)
{
    title = ttl;
    user_list.clear();
    current_user = User();
    message_list.clear();
}

//Implement method to load the text file
//and add the users in the vector
bool BBoard::loadUsers(const string &input_file)
{
    string u, p;
    bool notEnd = true;
    ifstream allUsers;
    allUsers.open(input_file.c_str());
    
    while (notEnd)
    {
        allUsers >> u;
        if (u != "end")
        {
            allUsers >> p;
            add_user(u, p);
        }
        else
        {
            notEnd = false;
        }
    }
    allUsers.close();
    return true;
}


//Implement method to login by using the
//username and password
bool BBoard::login()
{
    string user, pass;
    bool notValidUser = true;
    
    //welcome message
    cout << "Welcome to " << title << endl;
    
    //will keep looping unless terminated with
    //q/Q or when valid user and pass
    //is inputted
    do
    {
        cout << "Enter your username (\'Q\' or \'q\' to quit): ";
        cin >> user;
        if (user == "Q" || user == "q")
        {
            cout << "\nBye!" << endl;
            exit(0);
        }
        cout << "\nEnter your password: ";
        cin >> pass;
        if (userExists(user, pass))
        {
            current_user = get_user(user);
            notValidUser = false;
        }
        else
        {
            cout << "\nInvalid Username or Password!" << endl << endl;
        }
    } while (notValidUser);
    return true;
}

//Implement method to run the application
//using the username and password
void BBoard::run()
{
    //greetings
    cout << "\nWelcome back " << current_user.getUsername() << "!" << endl;
    cout << endl;
    
    //holds user input
    string action;
    
    
    //will become false when terminating
    bool notTerminate = true;
    
    //if action is set to Q or q, quit program
    while (notTerminate)
    {
        //MAIN MENU
        cout << "Menu" << endl;
        cout << "- Display Messages (\'D\' or \'d\')" << endl;
        cout << "- Add New Message (\'N\' or \'n\')" << endl;
        cout << "- Quit (\'Q\' or \'q\')" << endl;
        cout << "Choose an action: ";
        cin >> action;
        //Display message
        if (action == "D" || action == "d")
        {
            display();
        }
        //Add new message
        else if (action == "N" || action == "n")
        {
            add_message();
        }
        //Quit
        else if (action == "Q" || action == "q")
        {
            cout << "\nBye!";
            notTerminate = false;
        }
        else
        {
            notTerminate = false;
        }
        cout << endl;
    }
    
}

//PRIVATE//
//This function can be called from the setup function to add the users from file to
//user_list.
void BBoard::add_user(const string &name, const string &pass)
{
    user_list.push_back(User(name, pass));
}

//Useful for login function.
bool BBoard::userExists(const string &name, const string &pass) const
{
    for (unsigned int count = 0; count < user_list.size(); count++)
    {
        if (user_list.at(count).check(name, pass))
        {
            return true;
        }
    }
    return false;
}

//Returns the User with the given name.
User BBoard::get_user(const string &name) const
{
    for (unsigned int count = 0; count < user_list.size(); count++)
    {
        if (user_list.at(count).getUsername() == name)
        {
            return user_list.at(count);
        }
    }
    return user_list.at(0);
}

//This function would be used by the interface function run.
//It displays all messages
//in message_list.
void BBoard::display() const
{
    cout << endl;
    //if there is at least 1 message, continue on with functions
    if (message_list.size() == 0)
    {
        
        cout << "Nothing to Display." << endl;
    }
    else
    {
        //iterate through message list and display all
        for (unsigned int count = 0; count < message_list.size(); count++)
        {
            cout << "---------------------------------------------------------" << endl;
            cout << "Message #" << count + 1 << ": ";
            message_list.at(count).display();
        }
        cout << "---------------------------------------------------------" << endl;
    }
}

void BBoard::add_message()
{
    string subject, body;
    
    cout << endl;
    cout << "Enter Subject: ";
    cin.ignore();
    getline(cin, subject);
    
    cout << "\nEnter Body: ";
    getline(cin, body);
    
    //init message instance and its author, subject, and body
    Message record = Message(current_user.getUsername(), subject, body);
    
    //push back message class to vector
    message_list.push_back(record);
    cout << "\nMessage Recorded!" << endl;
}


