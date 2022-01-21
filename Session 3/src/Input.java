import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double amount = scan.nextDouble();
		
		System.out.println("Enter the promocode : ");
		int promocode = scan.nextInt();
		
		scan.close();
		
		System.out.println("Amount is : \u20b9"+amount);		
		System.out.println("Promocode is : "+promocode);

	}

}
