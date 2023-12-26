/*Crie um programa que receba uma frase e substitua todas as letras "a" por "e". */

package Exercicios100.Exercicios11A20.Exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fraseUsuario;

        System.out.print("Digite uma frase: ");
        fraseUsuario = input.nextLine().replace("a", "e");

        System.out.println(fraseUsuario);

        input.close();
    }
}
