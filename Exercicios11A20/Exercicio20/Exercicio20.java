/*Faça um programa que leia uma palavra e verifique se a mesma é palíndromo (se pode ser lida da mesma forma
* de trás para frente). */

package Exercicios100.Exercicios11A20.Exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavraNormal;
        boolean palindromo = true;

        System.out.print("Digite uma palavra: ");
        palavraNormal = input.nextLine().toLowerCase().replace(" ", "");

        for (int i = 0; i < palavraNormal.length(); i++) {
            char a = palavraNormal.charAt(i);
            char b = palavraNormal.charAt(palavraNormal.length() - i - 1);
            if (a != b) {
                palindromo = false;
                System.out.println("Não é palindrome");
                break;
            }
        }
        if (palindromo){
            System.out.println("É palindrome");
        }
        input.close();
    }
}
