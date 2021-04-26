package Alistirma;

public class Sayý_Bulma {

	public static void main(String[] args) {
		int [] sayilar = new int [] {1,2,3,5,7,9,0};
		int arananSayi = 5;
		boolean icinde = false;
		for (int aranan : sayilar) {
			if(aranan == arananSayi) {
				icinde = true;
				break;
			}
		
		
		}
		if (icinde) {
			System.out.println("Sayi dizi içinde mevcuttur.");
		}
		else {
			System.out.println("Sayi dizi içinde yoktur.");
		}
	
			
		

	}

}
