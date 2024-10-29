
/*Crie um programa que o usuário informe um número de 1 a 100. Outro usuário deve tentar adivinhar o número e o 
 * programa deve informar se o número digitado é maior ou menor que o número escolhido. O jogador terá um limite
 * de 7 tentativas, no final deve informar se acertou ou esgotou as tentativas.*/
import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numt = 0;

		System.out.print("Escolha um número de 1 a 100: ");
		int num = sc.nextInt();

		while (num < 1 || num > 100) {
			System.out.print("Número invalido!\nEscolha um número de 1 a 100: ");
			num = sc.nextInt();
		}

		System.out.println("\nVocê possui 7 tentaivas, boa sorte!");
		for (int i = 1; i <= 7; i++) {
			System.out.print(i + "° tentativa: ");
			numt = sc.nextInt();
			if (num > numt) {
				System.out.println("O número é maior que o número " + numt);
			} else if (num < numt) {
				System.out.println("O número é menor que o número " + numt);
			} else if (num == numt) {
				System.out.println("Parabéns, você acertou!");
				break;
			}
		}
		if (num != numt) {
			System.out.println("\nAcabou as suas tentativas, você perdeu!\nO número era: " + num);
		}

		sc.close();

	}

}
