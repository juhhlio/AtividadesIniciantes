//Escreva um programa que receba um nome e verifique se o mesmo começa com a letra "A".

package Exercicios100.Exercicios11A20.Exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeUsuario;

        System.out.print("Digite um nome: ");
        nomeUsuario = input.nextLine();
        if (nomeUsuario.startsWith("A") || nomeUsuario.startsWith("a")) {
            System.out.printf("A palavra %s começa com a letra A.",nomeUsuario);
        }
        else {
            System.out.printf("A palavra %s não começa com a letra A.",nomeUsuario);
        }
        input.close();
    }
}
