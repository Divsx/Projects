import java.util.Scanner;
import javax.swing.JOptionPane;

public class scanner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, what is your name?");
		String name = scan.nextLine();
//		
		System.out.println("HIIIIII " +name.toUpperCase()+" ITS SO NICE TO MEET YOU!!!!!");
		String response = scan.nextLine();
		
		System.out.println("Do you mind telling your age?"+  " yes or no");
		
		
		String okage = scan.nextLine();
		if(okage.equals( "yes")) {
			System.out.println("yassssss!!");
		}
		else 
			System.out.println("oh ;(");
		
		
		
		System.out.println("so what is it?");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Amazing!");
        System.out.println("how was your day");
	String r = scan.nextLine();
        
        if(r.equals("good")) {
        System.out.println("yayy sameeeee");
        }
        else
        	System.out.println("oh im sorry to hear that ;(");
        
		System.out.println("omggg look at the time i need to leave so sorry ill catch up with your next time!!");
				String response4 = scan.nextLine();
				System.out.println("byee");
		String response2 = scan.nextLine();
		if(response2.equals( "what about you")) {
			System.out.println("its a secret hehe :)"); 
		}
		else 
			return;
        
				
			
					
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
