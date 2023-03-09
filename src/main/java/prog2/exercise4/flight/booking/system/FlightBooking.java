package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;

public class FlightBooking {
     String flightCompany="Flights-of-Fancy";
     String   flightID="FOF0123MI";
     String passengerFullName;
     String tripSource="NANJING";
     String  sourceAirport="NANJING LUKOU INTERNATIONAL AIRPORT";
     String   tripDestination="OULU";
     String   destinationAirport=" OULU AIRPORT";
     LocalDate  departureDate;
     LocalDate  returnDate;
     int  childPassengers;
     int adultPassengers;
     int   totalPassengers;
     double   departingTicketPrice;
     double returnTicketPrice;
     double  totalTicketPrice;
     String ticketNumber;
     String bookingclass;
     String triptype;


     enum TripSource
    {
         NANJING,BEIJING, Shanghai, Oulu, Helsinki, Paris
    }


    enum BookingClass
    {
    FIRST , BUSINESS , ECONOMY
    }


    enum TripType
    {
        ONE_WAY,RETURN   
    }


    enum TripDestination
    {
        NANJING, BEIJING, Shanghai, Oulu, Helsinki,  Paris
    }



     public FlightBooking(String aNull, LocalDate depart, LocalDate returnDate, int i, int i1) {
        this.passengerFullName = aNull;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers =i;
        this.adultPassengers =i1;
    }


    public String getBookingClass()
    {
        return bookingclass;
    }
    public void setBookingClass(String bookingclass)
    {
        this.bookingclass=bookingclass;
    }


      public String getTripType()
      {
        return triptype;
      }
      public void setTripType(String triptype)
      {
        this.triptype=triptype;
      }
    
    
    
    
    
    public String getFlightCompany()
    {
        return flightCompany;
    }
    public void setFlightCompany(String flightCompany )
    {
        this.flightCompany=flightCompany;
    }


    public String getflightID()
    {
        return flightID;
    }
    public void setID(String flightID )
    {
        this.flightID=flightID;
    }


    public String getPassengerFullName()
    {
        return passengerFullName;
    }
    public void setPassengerFullName(String passengerFullName )
    {
        this.passengerFullName=passengerFullName;
    }


    public String getTripSource()
    {
        return tripSource;
    }
    public void setTripSource(String tripSource )
    {
        this.tripSource=tripSource;
    }


    public String getSourceAirport()
    {
        return sourceAirport;
    }
    public void setSourceAirport(String sourceAirport )
    {
        this.sourceAirport=sourceAirport;
    }


    public String getTripDestination()
    {
        return tripDestination;
    }
    public void setTripDestination(String tripDestination )
    {
        this.tripDestination=tripDestination;
    }


    public String getDestinationAirport()
    {
        return destinationAirport;
    }
    public void setDestinationAirport(String destinationAirport )
    {
        this.destinationAirport=destinationAirport;
    }


    public LocalDate getDepartureDate()
    {
        return departureDate;
    }
    public void setDepartureDate(LocalDate departureDate )
    {
        this.departureDate=departureDate;
    }


    public LocalDate getReturnDate()
    {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate )
    {
        this.returnDate=returnDate;
    }


    public int getChildPassengers()
    {
        return childPassengers;
    }
    public void setChildPassengers(int childPassengers )
    {
        this.childPassengers=childPassengers;
    }


    public int getAdultPassengers()
    {
        return adultPassengers;
    }
    public void setAdultPassengers(int adultPassengers )
    {
        this.adultPassengers=adultPassengers;
    }


    public int getTotalPassengers()
    {
        return totalPassengers;
    }
    public void setTotalPassengers(int ChildPassengers, int AdultPassengers )
    {
        this.totalPassengers = ChildPassengers+AdultPassengers;
    }


    public double  getDepartingTicketPrice()
    {
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(double  departingTicketPrice )
    {
        this.departingTicketPrice=departingTicketPrice;
    }


    public double  getReturnTicketPrice()
    {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice(double returnTicketPrice )
    {
        this.returnTicketPrice=returnTicketPrice;
    }


    public double  getTotalTicketPrice()
    {
        return totalTicketPrice;
    }
    public void setTotalTicketPrice(double  totalTicketPrice )
    {
        this.totalTicketPrice=totalTicketPrice;
    }


    public String  getTicketNumber()
    {
        return ticketNumber;
    }
    public void setTicketNumber(String  ticketNumber )
    {
        this.ticketNumber=ticketNumber;
    }
    public String toString()
    {return ("Dear " + passengerFullName + ". Thank you for booking your flight with " + flightCompany + "." + "\n" +
       "Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " +  returnDate + "\n" +
       "Total passengers: " + totalPassengers + "\n" +
       "Total ticket price in Euros: " + totalTicketPrice);
}
}


