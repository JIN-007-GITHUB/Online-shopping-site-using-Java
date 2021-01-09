import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		System.out.println("\n\n");
		System.out.println("shoppingadda.com");
		System.out.println("\n");
		System.out.println("                     ****|SHOPPINGADDA|****");
		System.out.println("\n ");
		System.out.println("               ****WELCOME TO SHOPPING ADDA***");
		System.out.println("\n");
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy                       'Time: 'hh:mm:ss a zzz");

		System.out.println(" Date: " + ft.format(dNow));
		System.out.println("*****************************************************************");
		System.out.println("              HAPPY NEW YEAR dont expect any discount...!!");
		System.out.println("\n");

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scn.nextLine();
		while (!name.matches("[a-zA-Z]+")) {
			System.out.println("Invalid Entry!! Retype your name..");
			name = scn.nextLine();
		}
		
		System.out.println("\n");
		System.out.print("Enter your Phone number(10digit):+91 ");
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();

		while (!num.matches("[0-9]{10}")) {
			System.out.println("Invalid number!! Re enter your number..");
			num = scan.nextLine();
		}
		System.out.println("\n");

		System.out.println("	   ***Welcome" + " " + name + " " + "To ShoppingADDA***");

		System.out.println("*******************************************************************");
		Category.getHomepage();
		scn.close();
	}
}
