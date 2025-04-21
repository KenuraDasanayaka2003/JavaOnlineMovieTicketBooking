package movieticketbooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        ArrayList<Movie> movies=new ArrayList<>();
        int choice;
        String title;
        int numberOfTickets;
        
        System.out.println("=====Welcome to the Online Ticket Booking System=====");
        
        do 
        {
        
            displayMenu();

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Choice : ");
            choice=sc.nextInt();
            

            switch(choice)
            {
                case 1:
                {
                   addMovie(movies);
                   break;
                }
                case 2:
                {
                    printMovies(movies);
                    break;
                }
                case 3:
                {
                    Scanner scn=new Scanner(System.in);
                    System.out.println("Enter the movie you prefered : ");
                    title=scn.nextLine();
                    System.out.println("Enter the number of tickets : ");
                    numberOfTickets=scn.nextInt();
                    calcTotalCost(title,movies,numberOfTickets);
                    break;
                }
            }
        }
        while(choice!=5);
    }
    public static void displayMenu()
    {
        System.out.println("1. Add a movie");
        System.out.println("2. View Movie details");
        System.out.println("3. Calculate Ticket Cost : ");
        System.out.println("5. Exit");
    }
    public static void addMovie(ArrayList<Movie> movies)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the movie title : ");
        String movieTitle=scan.nextLine();
        System.out.println("Enter the price of the ticket : ");
        double ticketPrice=scan.nextDouble();
        System.out.println("Enter the number of seats for the movie : ");
        int seatCount=scan.nextInt();
        
        Movie m=new Movie(movieTitle,ticketPrice,seatCount);
        
        movies.add(m);
    }
    public static void printMovies(ArrayList<Movie> movies)
    {
       for(Movie movie:movies)
        {
            System.out.println(movie);
        } 
    }
    public static void calcTotalCost(String movie,ArrayList<Movie> movies,int numberOfTickets)
    {
        double totalCost=0;
        for(Movie title:movies)
        {
            if(title.getMovieName().equals(movie))
            {
                totalCost=title.getTicketPrice()*numberOfTickets;
                int newSeatCount=title.getSeatCount()-numberOfTickets;
                title.setSeatCount(newSeatCount);
         
            }
        }
        System.out.println(totalCost);
    }
    
}
