#include <iostream>
#include <stdexcept>
#include "IntVector.h"

using namespace std;

//Constructor
IntVector::IntVector() : sz(0), cap(0), data(0) {}

//Parameterized constructor
IntVector::IntVector(unsigned size, int value) : sz(size), cap(size),
data(new int[size]) {
    for (unsigned i = 0; i < size; i++) {
        data[i] = value;
    }
}

//destructor method
IntVector::~IntVector()
{
    cout << "DECONSTRUCTING" << endl;
    delete[] data;
}

//Implement size method to
//get the size of the vector
unsigned IntVector::size() const {
    return sz;
}

//Implement method capacity
unsigned IntVector::capacity() const {
    return cap;
}

//Implement method empty
bool IntVector::empty() const {
    return sz == 0;
}


//Implement method at method constant
const int & IntVector::at(unsigned index) const {
    if (index >= sz)
    {
        throw out_of_range("IntVector::at_range_check");
    }
    else
    {
        return data[index];
    }
}

//Implement method at method of return type int
int & IntVector::at(unsigned index)
{
    if (index >= sz) {
        throw out_of_range("IntVectorassign::at_range_check");
    }
    else {
        return data[index];
    }
}

//Implement method insert method of return type void
void IntVector::insert(unsigned index, int value)
{
    if (index >= sz + 1)
    {
        throw out_of_range("IntVector::insert_range_check");
    }
    if (sz + 1 > cap && cap == 0)
    {
        expand(1);
    }
    else if (sz + 1 > cap)
    {
        expand();
    }
    ++sz;
    for (unsigned i = sz - 1; i > index; i--)
    {
        data[i] = data[i - 1];
    }
    data[index] = value;
    return;
}

//Implemeny erase method to remove the element
//at particulatr index
void IntVector::erase(unsigned index)
{
    if (index >= sz)
    {
        throw out_of_range("IntVector::erase_range_check");
    }
    for (unsigned i = index; i < sz - 1; i++) {
        data[i] = data[i + 1];
    }
    --sz;
    return;
}

//implement front() method to get the
//starting element in the vector of
//return type constant
const int & IntVector::front() const
{
    return data[0];
}

//implement front() method to get the
//starting element in the vector of
//return type int
int & IntVector::front() {
    return data[0];
}

//implement back() method to get the
//ending element in the vector of
//return type constant
const int & IntVector::back() const {
    return data[sz - 1];
}

//implement back() method to get the
//ending element in the vector of
//return type int
int & IntVector::back() {
    return data[sz - 1];
}

//implement method assign to set
//the element at particular index
void IntVector::assign(unsigned n, int value) {
    if (cap < n) {
        expand();
        if (cap < n) {
            expand(n - cap);
        }
    }
    sz = n;
    for (unsigned i = 0; i < sz; i++) {
        data[i] = value;
    }
    
    return;
}

//implement method push_back
//the element at particular index
void IntVector::push_back(int value)
{
    if (sz + 1 > cap) {
        if (cap == 0) {
            expand(1);
        }
        else {
            expand();
        }
    }
    ++sz;
    data[sz - 1] = value;
    
    return;
}

//Implement pop_back method to remove the
//element at back
void IntVector::pop_back() {
    --sz;
    
    return;
}

//implement clear method to clear the
//vector
void IntVector::clear() {
    sz = 0;
}

//implement resize() method to increase
//or decrease the vector
void IntVector::resize(unsigned size, int value) {
    if (size > cap) {
        expand();
        if (size > cap) {
            expand(size - cap);
        }
    }
    if (sz > size) {
        sz = size;
    }
    else if (sz < size) {
        for (unsigned i = sz; i < size; i++) {
            data[i] = value;
        }
        sz = size;
    }
    
    return;
}

//implement reverse method to reverse
//the elements in the vector
void IntVector::reserve(unsigned n) {
    if (cap < n) {
        expand();
        if (cap < n) {
            expand(n - cap);
        }
    }
    
    return;
}

//implement expland() method
//to create memory for new vector
void IntVector::expand() {
    int *temp = 0;
    
    temp = data;
    cap = 2 * cap;
    data = new int[cap];
    for (unsigned i = 0; i < sz; i++) {
        data[i] = temp[i];
    }
    delete[] temp;
    
    return;
}

//implement expland() parametrized method
void IntVector::expand(unsigned amount) {
    int *temp = 0;
    
    temp = data;
    cap = cap + amount;
    data = new int[cap];
    for (unsigned i = 0; i < sz; i++) {
        data[i] = temp[i];
    }
    delete[] temp;
    
    return;
}
