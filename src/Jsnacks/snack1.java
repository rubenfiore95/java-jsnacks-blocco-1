package Jsnacks;


import java.util.Scanner;

public class snack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		/*for (int i=0; i <5 ; i++) {
			System.out.println("Inserisci numero :");
			 int a = scan.nextInt();
			 num = num + a;			
		}
		
		System.out.println("la somma e': " + num);
		scan.close();
		*/
		int i = 0;
		do {
			System.out.println("Inserisci numero :");
			 int a = scan.nextInt();
			 num = num + a;	
			 i++;
		} while (i< 5);
		System.out.println("la somma e': " + num);
		scan.close();
	}
	
	
}
