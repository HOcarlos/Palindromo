package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String contrario ="";
		
		System.out.println("Digite uma palavra: ");
		String nome = sc.nextLine();
		
		for(int i = (nome.length() - 1); i >= 0; i--) {
			contrario = contrario + nome.charAt(i);	
		}
		
		if (contrario.toLowerCase().equals(nome.toLowerCase())) {
			System.out.println("É palindromo!");
		} else {
			System.out.println("Não é palindromo!");
		}
		sc.close();
	
	}

}
