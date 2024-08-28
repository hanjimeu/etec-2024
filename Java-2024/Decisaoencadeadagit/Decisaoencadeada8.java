 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decisaoencadeada8;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class Decisaoencadeada8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A (em cm): ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor de B (em cm): ");
        int B = scanner.nextInt();
        System.out.print("Digite o valor de C (em cm): ");
        int C = scanner.nextInt();

        if (A + B > C && A + C > B && B + C > A) {
            if (A == B && B == C) {
                System.out.println("Os valores compõem um triângulo equilátero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("Os valores compõem um triângulo isósceles.");
            } else {
                System.out.println("Os valores compõem um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores não compõem um triângulo.");
        }

        scanner.close();
    }
}
