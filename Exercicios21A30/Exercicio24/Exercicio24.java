/*Crie um programa que leia uma palavra e exiba a quantidade de vogais presentes na mesma.*/

package Exercicios100.Exercicios21A30.Exercicio24;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavraUsuario;
        int contadorUni = 0;

        System.out.print("Digite um frase: ");
        palavraUsuario = input.nextLine().toLowerCase();

        for (int i = 0; i < palavraUsuario.length(); i++) {
            char letra = palavraUsuario.charAt(i);

            if (letra == 'a' ||
                letra == 'e' ||
                letra == 'i' ||
                letra == 'o' ||
                letra == 'u'){
                contadorUni++;
            }

        }
        System.out.println("Quantidade de vogais: " + contadorUni);
        input.close();
    }
}
