/*Faça um programa que leia as notas de duas provas e informe se o aluno foi aprovado (nota maior ou igual a 6)
* ou reprovado (nota menor que 6) em cada uma das provas.*/

package Exercicios100.Exercicios31A40.Exercicio31;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double primeiraNota;
        double segundaNota;

        System.out.print("Digite a nota da primeira prova: ");
        primeiraNota = input.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        segundaNota = input.nextDouble();

        if (primeiraNota >= 6) {
            System.out.println("Você foi aprovado na primeira prova!");
        }
        else {
            System.out.println("Você foi reprovado na primeira prova!");
        }
        if (segundaNota > 6) {
            System.out.println("Você foi aprovado na segunda prova!");
        }
        else {
            System.out.println("Você foi reprovado na segunda prova!");
        }
        input.close();
    }
}
