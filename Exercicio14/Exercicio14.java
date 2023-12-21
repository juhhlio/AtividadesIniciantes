/*Escreva um programa que leia a posição x e y de dois pontos no plano cartesiano, e calcule a distância entre ambos*/

package Exercicios100.Exercicio14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double xA;
        double xB;
        double yA;
        double yB;
        double distancia;

        System.out.print("Digite a posição Xa:");
        xA = input.nextDouble();
        System.out.print("Digite a posição Xb:");
        xB = input.nextDouble();
        System.out.print("Digite a posição Ya:");
        yA = input.nextDouble();
        System.out.print("Digite a posição Yb:");
        yB = input.nextDouble();

        distancia = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA,2));

        System.out.printf("A distância é: %.2f",distancia);

        input.close();
    }
}
