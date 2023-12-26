/*Crie um programa que leia duas palavras e as concatene, exibindo a palavra resultante. */

package Exercicios100.Exercicios11A20.Exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String primeiraPalavra;
        String segundaPalavra;

        System.out.print("Digite a primeira palavra: ");
        primeiraPalavra = input.nextLine();
        System.out.print("Digite a segunda palavra: ");
        segundaPalavra = input.nextLine();

        System.out.println(primeiraPalavra + segundaPalavra);

        input.close();
    }
}
