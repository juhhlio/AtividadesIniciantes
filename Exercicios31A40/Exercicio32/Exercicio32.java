/*Faça um programa que leia as notas de duas provas, calcule a média aritmética simples, e informe se o aluno foi
* aprovado (média maior ou igual a 6) ou reprovado (média menor que 6).*/

package Exercicios100.Exercicios31A40.Exercicio32;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double primeiraProva;
        double segundaProva;
        double mediaProvas;

        System.out.print("Digite a nota da primeira prova: ");
        primeiraProva = input.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        segundaProva = input.nextDouble();

        mediaProvas = (primeiraProva + segundaProva) / 2;

        if (mediaProvas >= 6) {
            System.out.printf("Você foi aprovado com a média %.2f",mediaProvas);
        }
        else {
            System.out.printf("Você foi reprovado com a média %.2f",mediaProvas);
        }

        input.close();
    }
}
