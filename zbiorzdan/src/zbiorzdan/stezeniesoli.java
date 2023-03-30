package zbiorzdan;

import java.util.Scanner;

public class stezeniesoli {


	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int x;
	 System.out.println("Podaj ilosc soli");
	 x=sc.nextInt();
	 System.out.println("Stê¿enie procentowe soli wynosi"+((x/1000)*100)+" %");
	}
}


