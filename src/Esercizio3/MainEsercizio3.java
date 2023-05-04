package Esercizio3;

import java.util.Scanner;

public class MainEsercizio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Inserisci una stringa. Per terminare digita :q ");
			 String str = sc.nextLine();
			
			if(str.equals(":q")) {
				break;
			}
			for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i));
				if(i != str.length() -1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
