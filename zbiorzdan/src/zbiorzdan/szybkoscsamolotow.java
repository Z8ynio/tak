package zbiorzdan;

import java.util.Scanner;

public class szybkoscsamolotow {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 int x;
		 System.out.println("Podaj pr�dko�� samolotu w w�z��ch");
		 x=sc.nextInt();
		 System.out.println("Pr�dko�� w km/h wynosi"+(1.852*x));
		
	}

}
