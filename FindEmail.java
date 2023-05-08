import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindEmail {
    public static void main(String[] args) {
        List<String> Email=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        Email.add("email1@gmail.com");
        Email.add("email2@gmail.com");
        Email.add("email3@gmail.com");
        Email.add("email4@gmail.com");
        Email.add("email5@gmail.com");
        Email.add("email6@gmail.com");
        while(true) {
        	System.out.print("\nExit (y/n): ");
        	char r=input.next().charAt(0);
        	if(r=='y')
        		break;
        	System.out.println("\nEnter the Email to search");
        	input.nextLine();
        	String Search=input.nextLine();
            if(Email.contains(Search))
                System.out.println("Email found");
            else
                System.out.println("Email not found");
        }
        input.close();
    }
}
