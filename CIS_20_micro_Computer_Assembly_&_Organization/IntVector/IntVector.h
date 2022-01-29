#pragma once
#ifndef INTVECTOR_H
#define INTVECTOR_H
using namespace std;
//Declare class IntVector
class IntVector {
private:
    //declare data members
    unsigned sz;
    unsigned cap;
    int *data;
    void expand();
    void expand(unsigned amount);
public:
    //declare member functions
    //default constructor
    IntVector();
    //parametrized constructor
    IntVector(unsigned size, int value = 0);
    //destructor
    ~IntVector();
    //Declare the method size
    //to get the size of vector
    unsigned size() const;
    //Declare the method size
    //to get the capacity of vector
    unsigned capacity() const;
    //declare method empty
    bool empty() const;
    //declare at method to get the element
    //at particular index
    const int & at(unsigned index) const;
    //declare at method to get the element
    //at particular index
    int & at(unsigned index);
    //declare at method insert
    void insert(unsigned index, int value);
    //declare method erase
    void erase(unsigned index);
    //declare method front
    const int & front() const;
    int & front();
    const int & back() const;
    int & back();
    void assign(unsigned n, int value);
    void push_back(int value);
    void pop_back();
    void clear();
    void resize(unsigned size, int value = 0);
    void reserve(unsigned n);
};
#endif
