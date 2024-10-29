/*Crie um programa para simular um caixa eletrônico. O programa deve solicitar
 * ao usuário o valor que deseja sacar e calcular a quantidade mínima de ntotas 
 * que o caixa eletrônico fornecerá para atender ao saque. Considere que o caixa 
 * eletrônico possui notas de 100, 50, 20, 10, 5 e 2 reais.*/

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor que deseja sacar: ");
		int valor = sc.nextInt();

		int v100 = 0, v50 = 0, v20 = 0, v10 = 0, v5 = 0, v2 = 0;

		while (valor >= 100) {
			v100++;
			valor -= 100;
		}
		while (valor >= 50) {
			v50++;
			valor -= 50;
		}
		while (valor >= 20) {
			v20++;
			valor -= 20;
		}
		while (valor >= 10) {
			v10++;
			valor -= 10;
		}
		if (valor % 2 == 0) {
			if (valor % 5 == 0) {
				while (valor >= 5) {
					v5++;
					valor -= 5;
				}
			}
		} else {
			while (valor >= 5) {
				v5++;
				valor -= 5;
			}
		}
		while (valor >= 2) {
			v2++;
			valor -= 2;
		}

		if (v100 != 0) {
			System.out.println(" - " + v100 + " notas de 100 reais");
		}
		if (v50 != 0) {
			System.out.println(" - " + v50 + " notas de 50 reais");
		}
		if (v20 != 0) {
			System.out.println(" - " + v20 + " notas de 20 reais");
		}
		if (v10 != 0) {
			System.out.println(" - " + v10 + " notas de 10 reais");
		}
		if (v5 != 0) {
			System.out.println(" - " + v5 + " notas de 5 reais");
		}
		if (v2 != 0) {
			System.out.println(" - " + v2 + " notas de 2 reais");
		}
		
		sc.close();
	}

}