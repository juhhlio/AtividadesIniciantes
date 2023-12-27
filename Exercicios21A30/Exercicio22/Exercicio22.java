/*Escreva um programa que receba um nome completo e exiba somente o primeiro nome.*/

package Exercicios100.Exercicios21A30.Exercicio22;


import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeUsuario;

        System.out.print("Digite um nome completo: ");
        nomeUsuario = input.nextLine();
        String[] nomeSeparado = nomeUsuario.strip().split(" ");

        System.out.println("O primeiro nome é: " + nomeSeparado[0]);

        input.close();
    }
}
