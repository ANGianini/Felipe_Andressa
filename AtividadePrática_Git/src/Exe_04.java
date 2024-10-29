/*Crie um programa que multiplica todos os números impares entre 1 e o número fornecido pelo usuário.*/

import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total = 1;

		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				total *= i;
			}
		}
		System.out.print(total);

		sc.close();

	}

}
