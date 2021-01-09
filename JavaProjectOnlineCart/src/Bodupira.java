
import java.util.Scanner;

public class Bodupira {
	
	public static void getExit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to exit? Y/N ");
		char choice=sc.next().charAt(0);
		if(choice=='Y'||choice=='y') {
			Carts.ext();
			
			return;
		}
		else if(choice=='N'||choice=='n'){
			Category.getHomepage();
		}
		else {
			System.out.println("Enter the valid input");
			System.out.println("\n");
			getExit();
		}
    return;
}
}