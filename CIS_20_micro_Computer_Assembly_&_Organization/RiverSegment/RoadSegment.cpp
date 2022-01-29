
#include "RoadSegment.h"

// call the super class constructor
RoadSegment::RoadSegment(string name, double defaultSpeed, double distance) : TransportationLink(name, distance)
{
    // add the speeds to the vector
    for( size_t hour=0; hour<HOURS_PER_DAY; hour++ )
        speeds.push_back(defaultSpeed);
}

// the method to set the speed of a particular hour
void RoadSegment::setHourSpeed(unsigned hour, double speed)
{
    // set the speed at this hour
    speeds[hour] = speed;
}

// method to set the speed all the hours
void RoadSegment::setAllHourSpeeds(const vector<double> & speeds)
{
    // iterate the list of vectors
    // for( unsigned hour=0; hour < speeds.size(); hour++ )
    // setHourSpeed(hour, speeds[hour]);
    this->speeds = speeds;
}

// the method to compute the arrival time
unsigned RoadSegment::computeArrivalTime(unsigned minute) const
{
    // get the starting hour
    minute = minute % MINS_PER_DAY;
    unsigned hour = minute/MINS_PER_HOUR;
    
    // given the distance, find the time it will take to reach
    double arrivalTime = minute + (_distance/speeds[hour]) * MINS_PER_HOUR;
    
    // return the arrival time
    return arrivalTime;
}

