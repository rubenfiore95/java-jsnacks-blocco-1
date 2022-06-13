package Jsnacks;

import java.util.Random;

public class Snack3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String[] Nomi = {"Giggino", "Riccardo", "Pinco", "Gianni", "Giorgio"};
	 String[] Cognomi = {"Borriello", "Pappalardo", "Pallo", "Rossi", "Esposito"};
	 
     Random random = new Random();
     
	 
     for (int i = 0; i < 3; i++) {
    	 int ran = random.nextInt(4);
    	 int con = random.nextInt(4);
		 System.out.println(Nomi[ran] + " " + Cognomi[con]);
	}
	 
	 
	 
	 

	}

}
