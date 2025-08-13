import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();

		System.out.print("Digite sua altura (em metros): ");
		double altura = sc.nextDouble();

		System.out.printf("Olá, %s! Você tem %d anos e %.2f metros de altura.\n", nome, idade, altura);

		sc.close();
	}
}
