package Esercizio2;

public class MainEsercizio2 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 6;
		String prova1 = usoSwitch(num1);
		String prova2 = usoSwitch(num2);
		System.out.println(prova1);
		System.out.println(prova2);
		

	}
	
	public static String usoSwitch(int num) {
		switch (num) {
		case 0:
			return "zero";
		case 1:
			return "uno";
		case 2:
			return "due";
		case 3:
			return "tre";
		default:
			return "errore! Il numero non è compreso tra 0 e 3";
		}
	}

}
