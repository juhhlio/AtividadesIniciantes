/*Escreva um programa que receba um nome completo e exiba o sobrenome (último nome) primeiro*/

package Exercicios100.Exercicios21A30.Exercicio25;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeCompleto;
        String[] nomePartes;
        String sobreNome;

        System.out.print("Digite seu nome completo: ");
        nomeCompleto = input.nextLine();

        nomePartes = nomeCompleto.strip().split(" ");
        sobreNome = nomePartes[nomePartes.length -1];

        System.out.print("Nome com sobrenome primeiro: ");
        System.out.print(sobreNome);

        for (int i = 0; i < nomePartes.length -1; i++) {
            System.out.print(" " + nomePartes[i]);
        }
        System.out.println();
        input.close();
    }
}
