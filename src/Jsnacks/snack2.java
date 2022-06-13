package Jsnacks;

import java.util.Scanner;

public class snack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner scan = new Scanner(System.in);
       
		System.out.println("Inserisci un numero");
		 int num = scan.nextInt();
		 
		 if (num % 2 == 0) {
			 System.out.println("numero pari: " + num);
			
		} else {
			System.out.println("numero successivo pari: " + (num +1));
		}
	scan.close();
	
	}

}
