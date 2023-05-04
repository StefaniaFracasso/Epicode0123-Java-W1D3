package Esercizio1;

public class MainEsercizio1 {

	public static void main(String[] args) {
		//Esercizio 1a
		String str1 = "airpods";
		String str2 = "mela";
		boolean pariODispari1 = stringaPariDispari(str1);
		boolean pariODispari2 = stringaPariDispari(str2);
		System.out.println("Il numero di caratteri della parola " + str1 + " sono pari? " +pariODispari1);
		System.out.println("Il numero di caratteri della parola " + str2 + " sono pari? " +pariODispari2);
		System.out.println("------------");
		//Esercizio 1b
		int anno1 = 1986;
		int anno2 = 2024;
		boolean bisestile1 = annoBisestile(anno1);
		boolean bisestile2 = annoBisestile(anno2);
		System.out.println("l'anno " + anno1 + " è bisestile? " + bisestile1);
		System.out.println("l'anno " + anno2 + " è bisestile? " + bisestile2);
	}
	
	public static boolean stringaPariDispari(String str) {
		if(str.length() % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean annoBisestile(int anno) {
		if(anno % 4 == 0) {
			return true;
		}else if (anno % 100 == 0 && anno % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
