import java.util.*;

class BookDetails{
    static int available = 50;
    static int windowSeats = 15;
    boolean BookTicket(int count){
        if(count <= available){
            available -= count;
            return true;
        }
        return false;
    }

    boolean BookTicket(int count, char windows)
    {
        if(count <= windowSeats)
        {
            available -= count;
            return true;
        }
        return false;        
    }
}

public class TicketBooking{
    public static void main(String[] args) {

            BookDetails obj = new BookDetails();
            while(obj.available != 0)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("How many tickets you want?");
                int ticket = sc.nextInt();
                System.out.println("Did you want window seat?(y/n)");
                char window = sc.next().charAt(0);
                if((window == 'y' || window == 'Y') && obj.BookTicket(ticket, window))
                {
                    System.out.println("Windows Ticket Booked Successfully!!");
                }
                else if((window == 'n' || window == 'N') && obj.BookTicket(ticket))
                {
                    System.out.println("Ticket Booked Successfully!!");
                }
                else
                {
                    System.out.println("Sorry... We don't have enough tickets!!");
                }

                System.out.println("\nAvailable Tickets are " + obj.available + "\n");
                System.out.println("Want to exit ? (y/n)");
                char exit = sc.next().charAt(0);
                if(exit == 'y' || exit == 'Y')
                {
                    System.exit(0);
                }
            }
    }
}