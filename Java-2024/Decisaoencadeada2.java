/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decisaoencadeada2;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class Decisaoencadeada2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.0) {
            System.out.println("Classificação: Magreza");
        } else if (imc >= 18.0 && imc <= 24.9) {
            System.out.println("Classificação: Saudável");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30.0) {
            System.out.println("Classificação: Obesidade");
        }

        scanner.close();
    }
}