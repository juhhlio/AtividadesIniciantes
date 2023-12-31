/*Faça um programa que solicite a idade de uma pessoa e exiba se ela é maior de idade ou não.*/

package Exercicios100.Exercicios21A30.Exercicio26;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeUsuario;
        int idadeUsuario;

        System.out.print("Digite seu nome: ");
        nomeUsuario = input.nextLine().strip();
        System.out.print("Digite sua idade: ");
        idadeUsuario = input.nextInt();

        if (idadeUsuario >= 18) {
            System.out.printf("%s você é maior de idade!",nomeUsuario);
        }
        else {
            System.out.printf("%s você não é maior de idade",nomeUsuario);
        }

        input.close();
    }
}
