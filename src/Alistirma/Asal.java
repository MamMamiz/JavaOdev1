package Alistirma;

public class Asal {

	public static void main(String[] args) {
		int number = -45;
		
		boolean asal = true;
		
		if(number == 1) {
			System.out.println("Say� asal say� de�ildir.");
			return;
		}
			
		if (number <1) {
			System.out.println("Ge�ersiz say� !");
			return;
		}
		for (int i=2; i< number; i++) {
			if (number % i == 0);
			    asal = false;
			   
		}
		
		if(asal) {
			System.out.println("Say� asald�r.");
			
		}
		else {
			System.out.println("Say� asal say� de�ildir.");
		}

	}

}
