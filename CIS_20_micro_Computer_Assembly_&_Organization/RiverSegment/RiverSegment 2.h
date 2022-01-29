

#ifndef RiverSegment_hpp
#define RiverSegment_hpp

// include the TransportationLink class
#include "TransportationLink.h"

// include the vector
#include <vector>

// the RiverSegment class extends the TransportationLink class
class RiverSegment: public TransportationLink
{
    // the private data members of this class
private:
    
    // the list of the departure times
    vector<double> scheduledDepartureTimes;
    
    // the speed of the ferry
    double _speed;
    
    // the public data members of this class
public:
    
    // the constructor
    RiverSegment(string name, double speed, double distance);
    
    // method to set the speed
    void setSpeed(double speed);
    
    // method to add departure time - the list of departure times must be sorted
    void addDepartureTime(double hour);
    
    // method to get the arrival time
    unsigned computeArrivalTime(unsigned minute) const;
    
};

#endif 
