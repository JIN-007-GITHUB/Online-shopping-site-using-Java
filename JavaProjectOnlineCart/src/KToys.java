import java.util.InputMismatchException;
import java.util.Scanner;

public class KToys
{
		public static void getKToys()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("*************************************************************");
			System.out.println("TOYS");
			
			int a=3000; String s="cycle";
			System.out.println("1. cycle			Rate=Rs3000");
			
			int a1=200; String s1="Doll";
			System.out.println("2. Doll				Rate=Rs200");
			
			int a2=100; String s2="Ball	";
			System.out.println("3. Ball				Rate=Rs100");
			System.out.println("4. Previous page");
			System.out.println("5. Home Page");
			System.out.println("6. Exit");
			System.out.println("Select choice:");
			try {
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Carts.addCart(a, s);
				break;
			case 2:
				Carts.addCart(a1,s1);
				break;
			case 3:
				Carts.addCart(a2,s2);
				break;
			case 4:
				Kids.getKids();
				break;
			case 5:
				Category.getHomepage();
				break;
			case 7:
				Exit.getExit();
				break;
			default:
				System.out.println("chioce give option... try again!");
				getKToys();
				break;
		}
	}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice");
			getKToys();
			}
		}
	}