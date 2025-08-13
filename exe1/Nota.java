import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        double nota = 0.0;

        while (continuar) {
            System.out.print("Digite a nota do aluno: ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida");
            } else {
                continuar = false;
            }
        }

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota <= 6.9) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}