package application;

import java.util.Locale;
import java.util.Scanner;
import services.BrazilInterestService;
import services.InterestRate;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestRate in = new BrazilInterestService(2.0);
		//InterestRate in = new UsaInterestService(1.0);  <-- OU SE DESEJAR MUDAR A CLASSE UTILIZANDO A INTERFACE

		
		double payment = in.payment(amount, months);
				
		System.out.println("Payment after: " + months + " months:");
		System.out.println(String.format("%.2f", payment));
	
		sc.close();
	}

}
