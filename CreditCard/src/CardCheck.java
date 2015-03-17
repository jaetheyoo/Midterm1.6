import java.util.Scanner;

public class CardCheck {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
   
	System.out.print("Please enter your credit card number: ");
	String CreditCard = input.nextLine();
	
	LuhnsAlgorithm CreditCheck = new LuhnsAlgorithm(CreditCard);
	if (CreditCheck.isValid()) {
		System.out.println("Sorry, this is not a valid number for a credit card");
	}
	else {
		System.out.println("This card is valid. Thank you.");
	}
	input.close();
}
}

