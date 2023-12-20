/*Escreva um programa que calcule o perímetro e a área de um triângulo,
* utilizando as fórmulas P = a + b + c e A = (b * h) / 2, onde a, b e c são os lados
* do triângulo e h é a altura relativa ao lado b.*/

package Exercicios100.Exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double ladoA;
        double ladoB;
        double ladoC;
        double alturaRelativaH;
        double perimetroTriangulo;
        double areaTriangulo;

        System.out.print("Digite o valor do lado A do triângulo: ");
        ladoA = input.nextDouble();
        System.out.print("Digite o valor do lado B do triângulo: ");
        ladoB = input.nextDouble();
        System.out.print("Digite o valor do lado C do triângulo: ");
        ladoC = input.nextDouble();
        System.out.print("Digite o valor da altura relativa do lado B do triângulo: ");
        alturaRelativaH = input.nextDouble();

        perimetroTriangulo =  ladoA + ladoB + ladoC;
        areaTriangulo  = (ladoB * alturaRelativaH) / 2;

        System.out.printf("O perímetro do triângulo é: %.2f\n", perimetroTriangulo);
        System.out.printf("A área do triângulo é: %.2f", areaTriangulo);
        input.close();
    }
}
