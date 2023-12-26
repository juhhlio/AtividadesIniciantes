/*Faça um programa que receba uma palavra e exiba cada letra separadamente (necessita de laço de repetição)*/

package Exercicios100.Exercicios11A20.Exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavraUsuario;

        System.out.print("Digite uma palavra: ");
        palavraUsuario = input.nextLine();

        for (int i = 0; i < palavraUsuario.length(); i++){
            char letra = palavraUsuario.charAt(i);
            System.out.println(letra);
        }
        input.close();
    }
}
