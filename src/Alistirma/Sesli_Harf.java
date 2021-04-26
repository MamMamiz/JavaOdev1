package Alistirma;

public class Sesli_Harf {

	public static void main(String[] args) {
		char harf = 'A';
		
		switch (harf) {
		
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Harf kalýn seslidir.");
				break;
			case 'E':
			case 'Ý':
			case 'Ö':
			case 'Ü':
				System.out.println("Harf ince seslidir");
				break;
		
			
			
		}

	}

}
