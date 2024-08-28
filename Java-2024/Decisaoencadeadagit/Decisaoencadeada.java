/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decisaoencadeada;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class Decisaoencadeada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora de início do turno (0-23): ");
        int hora = scanner.nextInt();

        if (hora >= 5 && hora < 13) {
            System.out.println("Turno: Manhã");
        } else if (hora >= 13 && hora < 21) {
            System.out.println("Turno: Tarde");
        } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora < 5)) {
            System.out.println("Turno: Noite");
        } else {
            System.out.println("Hora inválida. Por favor, insira uma hora entre 0 e 23.");
        }

        scanner.close();
    }
}