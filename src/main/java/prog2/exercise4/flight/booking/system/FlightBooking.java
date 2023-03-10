package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;

public class FlightBooking {
     String flightCompany="Flights-of-Fancy";
     String   flightID="FOF0123MI";
     String passengerFullName;
     FlightBooking.TripSource tripSource;
     FlightBooking.SourceAirport  sourceAirport;
     FlightBooking.TripDestination   tripDestination;
     FlightBooking.DestinationAirport   destinationAirport;
     LocalDate  departureDate;
     LocalDate  returnDate;
     int  childPassengers;
     int adultPassengers;
     int   totalPassengers;
     double   departingTicketPrice;
     double returnTicketPrice;
     double  totalTicketPrice;
     String ticketNumber;
     FlightBooking.BookingClass bookingclass;
     FlightBooking.TripType triptype;


    enum DestinationAirport
    {
    
     NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport, 
     ParisCharlesdeGaulleAirport

    }



     enum SourceAirport
     {
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport, 
        ParisCharlesdeGaulleAirport
     }


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


    public FlightBooking.BookingClass getBookingClass()
    {
        return bookingclass;
    }
    public void setBookingClass(String num)
    {
        switch(num)
        {
            case"1":this.bookingclass=FlightBooking.BookingClass.values()[0];
            case"2":this.bookingclass=FlightBooking.BookingClass.values()[1];
            case"3":this.bookingclass=FlightBooking.BookingClass.values()[2];
        }
    }


      public FlightBooking.TripType getTripType()
      {
        return triptype;
      }
      public void setTripType(String num)
      {
        switch(num)
        {
           case"1":this.triptype=FlightBooking.TripType.values()[0];
           case"2":this.triptype=FlightBooking.TripType.values()[1];
        }
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


    public FlightBooking.TripSource getTripSource()
    {
        return tripSource;
    }
    public void setTripSource(String num )
    {
        switch(num)
        {
            case "1":this.tripSource=FlightBooking.TripSource.values()[0];
            case "2":this.tripSource=FlightBooking.TripSource.values()[1];
            case "3":this.tripSource=FlightBooking.TripSource.values()[2];
            case "4":this.tripSource=FlightBooking.TripSource.values()[3];
            case "5":this.tripSource=FlightBooking.TripSource.values()[4];
            case "6":this.tripSource=FlightBooking.TripSource.values()[5];
        }
    }


    public FlightBooking.SourceAirport getSourceAirport()
    {
        return sourceAirport;
    }
    public void setSourceAirport(FlightBooking.SourceAirport sourceAirport )
    {
        this.sourceAirport=sourceAirport;
    }


    public FlightBooking.TripDestination getTripDestination()
    {
        return tripDestination;
    }
    public void setTripDestination(String a,String b )
    {
        switch(b)
        {
            case "1":this.tripDestination=FlightBooking.TripDestination.values()[0];
            case "2":this.tripDestination=FlightBooking.TripDestination.values()[1];
            case "3":this.tripDestination=FlightBooking.TripDestination.values()[2];
            case "4":this.tripDestination=FlightBooking.TripDestination.values()[3];
            case "5":this.tripDestination=FlightBooking.TripDestination.values()[4];
            case "6":this.tripDestination=FlightBooking.TripDestination.values()[5];
        }
    }


    public FlightBooking.DestinationAirport getDestinationAirport()
    {
        return destinationAirport;
    }
    public void setDestinationAirport(FlightBooking.DestinationAirport destinationAirport )
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
    public void setDepartingTicketPrice(int child,int adults )
    {
        this.departingTicketPrice=departingTicketPrice;
    }


    public double  getReturnTicketPrice()
    {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice()
    {
        this.returnTicketPrice=returnTicketPrice;
    }


    public double  getTotalTicketPrice()
    {
        return totalTicketPrice;
    }
    public void setTotalTicketPrice()
    {
        this.totalTicketPrice=Math.abs(getTotalTicketPrice());
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


