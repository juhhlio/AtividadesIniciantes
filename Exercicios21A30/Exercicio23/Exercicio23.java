/*Faça um programa que receba uma frase e exiba a quantidade de espaços em branco presentes na mesma.*/

package Exercicios100.Exercicios21A30.Exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fraseUsuario;
        int fraseSemEspaco;
        int totalEspaco;

        System.out.print("Digite uma frase: ");
        fraseUsuario = input.nextLine();

        fraseSemEspaco = fraseUsuario.replace(" ", "").length();
        totalEspaco = fraseUsuario.length() - fraseSemEspaco;

        System.out.printf("O número de espaços em brancos é: %d\n",totalEspaco);
        input.close();
    }
}
