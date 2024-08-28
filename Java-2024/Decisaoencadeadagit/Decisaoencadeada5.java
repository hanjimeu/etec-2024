/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decisaoencadeada5;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class Decisaoencadeada5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das 4 notas
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Determinação do conceito e resultado
        String conceito;
        String resultado;

        if (media >= 9) {
            conceito = "A";
            resultado = "Aprovado";
        } else if (media >= 7) {
            conceito = "B";
            resultado = "Aprovado";
        } else if (media >= 5) {
            conceito = "C";
            resultado = "Aprovado";
        } else if (media >= 2.5) {
            conceito = "D";
            resultado = "Reprovado";
        } else {
            conceito = "E";
            resultado = "Reprovado";
        }

        // Saída da média e do conceito
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Resultado: " + resultado);
    }
}