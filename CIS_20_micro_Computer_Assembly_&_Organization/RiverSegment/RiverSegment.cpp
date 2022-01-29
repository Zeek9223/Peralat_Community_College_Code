
#include "RiverSegment.h"

// the constructor
// call the super class constructor
RiverSegment::RiverSegment(string name, double speed, double distance) : TransportationLink(name, distance)
{
    // set the speed
    setSpeed(speed);
}

// method to set the speed
void RiverSegment::setSpeed(double speed)
{
    // set the speed
    this->_speed = speed;
}

// method to add departure time - the list of departure times must be sorted
void RiverSegment::addDepartureTime(double hour)
{
    // add the departure time
    scheduledDepartureTimes.push_back(hour);
    
    // sort
    for( size_t i=0; i<scheduledDepartureTimes.size(); i++)
    {
        for( size_t j=0; j<scheduledDepartureTimes.size()-1; j++)
        {
            // compare the jth and the j+1th entries
            if( scheduledDepartureTimes[j] > scheduledDepartureTimes[j+1])
            {
                // swap
                double temp = scheduledDepartureTimes[j];
                scheduledDepartureTimes[j] = scheduledDepartureTimes[j+1];
                scheduledDepartureTimes[j+1] = temp;
            }
        }
    }
}


// method to get the arrival time
unsigned RiverSegment::computeArrivalTime(unsigned minute) const
{
    // the index for the ferry
    int index = 0;
    
    // as long as the minute is greater than the scheduled departure
    while( minute > (MINS_PER_HOUR * scheduledDepartureTimes[index]) )
        index++;
        
    // calculate the arrival time
    double arrivalTime = (MINS_PER_HOUR * scheduledDepartureTimes[index]) + (_distance/_speed) * MINS_PER_HOUR;
    
    // return the arrival time
    return arrivalTime;
}

