
#ifndef RoadSegment_hpp
#define RoadSegment_hpp

#include "RoadSegment.h"
#include <vector>

// include the Transport Link class
#include "TransportationLink.h"

// the Road segment class derives from the Transport link class
class RoadSegment : public TransportationLink
{
    // the private data members of this class
private:
    
    // the vector to store the speed for the 24 hours
    // 0 index being the speed at midnight
    vector<double> speeds;
    
    // the public data members of this class
public:
    
    // the constructor to take in the name, default speed and the distance
    RoadSegment(string name, double defaultSpeed, double distance);
    
    // the method to set the speed of a particular hour
    void setHourSpeed(unsigned hour, double speed);
    
    // method to set the speed all the hours
    void setAllHourSpeeds(const vector<double> & speeds);
    
    // the method to compute the arrival time
    unsigned computeArrivalTime(unsigned minute) const;
    
};

#endif 
