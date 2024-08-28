/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decisaoencadeada3;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class Decisaoencadeada3 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de Lanches do McDonald's:");
        System.out.println("1. BigMac");
        System.out.println("2. Quarteirão");
        System.out.println("3. MacChicken");
        System.out.println("4. Cheddar");
        System.out.println("5. Cheese burger");
        
        System.out.print("Digite o número da sua opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu: BigMac");
                break;
            case 2:
                System.out.println("Você escolheu: Quarteirão");
                break;
            case 3:
                System.out.println("Você escolheu: MacChicken");
                break;
            case 4:
                System.out.println("Você escolheu: Cheddar");
                break;
            case 5:
                System.out.println("Você escolheu: Cheese burger");
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                break;
        }

        scanner.close();
    }
}