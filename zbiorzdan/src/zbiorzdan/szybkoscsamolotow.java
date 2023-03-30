package zbiorzdan;

import java.util.Scanner;

public class szybkoscsamolotow {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 int x;
		 System.out.println("Podaj prêdkoœæ samolotu w wêz³¹ch");
		 x=sc.nextInt();
		 System.out.println("Prêdkoœæ w km/h wynosi"+(1.852*x));
		
	}

}
