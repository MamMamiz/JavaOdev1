package Alistirma;

public class MüqSayý {

	public static void main(String[] args) {
		int number =28;
		int tut = 0;
		for (int i=1;i<number;i++) {
			if(number % i == 0) {
				tut= tut + i;
				
		}	
			
		}		
		
		if(number == tut) {
					System.out.println("Girilen sayý mükemmel sayýdýr !");
		}
		else {
					System.out.println("Girilen sayý mükemmel sayý deðildir !");
		}
		
		
		

	}

}
