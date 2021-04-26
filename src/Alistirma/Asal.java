package Alistirma;

public class Asal {

	public static void main(String[] args) {
		int number = -45;
		
		boolean asal = true;
		
		if(number == 1) {
			System.out.println("Sayı asal sayı değildir.");
			return;
		}
			
		if (number <1) {
			System.out.println("Geçersiz sayı !");
			return;
		}
		for (int i=2; i< number; i++) {
			if (number % i == 0);
			    asal = false;
			   
		}
		
		if(asal) {
			System.out.println("Sayı asaldır.");
			
		}
		else {
			System.out.println("Sayı asal sayı değildir.");
		}

	}

}
