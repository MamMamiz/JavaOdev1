package Alistirma;

public class Say�_Bulma {

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
			System.out.println("Sayi dizi i�inde mevcuttur.");
		}
		else {
			System.out.println("Sayi dizi i�inde yoktur.");
		}
	
			
		

	}

}
