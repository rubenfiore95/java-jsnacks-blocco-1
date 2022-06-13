package Jsnacks;



public class Snack4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] lista= {1,2,3,4,5,6,7,8,9,10};
		int a = 0;
		
		for (int i=0; i < lista.length; i += 2) {
			a = a + lista[i];		
		}
		
		System.out.println("la somma delle caselle dispari e':" + a);
	}

}
