package atividade1;
import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros informados:");

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}
