/*Crie um programa que leia duas palavras e verifique se a segunda palavra é um anagrama da primeira*/

package Exercicios100.Exercicios21A30.Exercicio21;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String primeiraPalavra;
        String segundaPalavra;

        System.out.print("Digite a primeira palavra: ");
        primeiraPalavra = input.nextLine().toLowerCase();
        System.out.print("Digite a segunda palavra: ");
        segundaPalavra = input.nextLine().toLowerCase();

        char[] primeiraPalavraSort = primeiraPalavra.toCharArray();
        char[] segundaPalavraSort = segundaPalavra.toCharArray();

        Arrays.sort(primeiraPalavraSort);
        Arrays.sort(segundaPalavraSort);

        if (primeiraPalavra.length() == segundaPalavra.length()) {
            if (Arrays.equals(primeiraPalavraSort, segundaPalavraSort)) {
                System.out.println("É anagrama");
            }
            else {
                System.out.println("Não é anagrama");
            }
        }
        else {
            System.out.println("Não é anagrama.");
        }

        input.close();
    }
}
