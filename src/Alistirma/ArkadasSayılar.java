package Alistirma;

public class ArkadasSayýlar {

	public static void main(String[] args) {
		int no1 = 220;
		
		int tut1 = 0 ;
		
		
		for (int i=1 ;i<no1 ;i++) {
			if(no1 % i == 0) {
				tut1= tut1 + i;
				
			}
		}
		
		
		
		int no2 = 284;
		int tut2 = 0 ;
		for (int j=1 ; j<no2 ; j++) {
			if(no2 % j == 0) {
				tut2= tut2 + j;
				
		    }
		
		}
	
		if(tut1 == no2 && tut2 == no1 ) {
			System.out.println("Arkadaþ sayýdýr.");
		}
		else {
			System.out.println("Arkadaþ sayý deðildir.");
		}
		

	 }
}

