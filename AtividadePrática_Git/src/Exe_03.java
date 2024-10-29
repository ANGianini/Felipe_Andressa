
/* Crie um programa que soma todos os números pares entre 1 e o número fornecido pelo usuário.
 * */

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0){
				soma += i;
			 }
		} 
		System.out.println(soma);

		sc.close();
	}

}
