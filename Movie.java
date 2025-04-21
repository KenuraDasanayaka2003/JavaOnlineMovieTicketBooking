package movieticketbooking;

public class Movie 
{
    private String movieName;
    private double ticketPrice;
    private int seatCount;
    
    public Movie(String movieName,double ticketPrice,int seatCount)
    {
        setMovieName(movieName);
        setTicketPrice(ticketPrice);
        setSeatCount(seatCount);
    }

    public void setMovieName(String movieName) 
    {
        this.movieName = movieName;
    }

    public void setTicketPrice(double ticketPrice) 
    {
        this.ticketPrice = ticketPrice;
    }

    public void setSeatCount(int seatCount) 
    {
        this.seatCount = seatCount;
    }

    public String getMovieName() 
    {
        return movieName;
    }

    public double getTicketPrice() 
    {
        return ticketPrice;
    }

    public int getSeatCount() 
    {
        return seatCount;
    }
    @Override
    public String toString()
    {
        String msg="Movie Title : "+getMovieName();
        msg+="\nPrice of the ticket : "+getTicketPrice();
        msg+="\nSeat count of the movie : "+getSeatCount();
        return msg;
    }
}
