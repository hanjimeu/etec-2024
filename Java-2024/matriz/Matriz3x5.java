import java.util.Scanner;

public class Matriz3x5 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        boolean temRepetidos = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = i; k < 3; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (i != k || j != l) {
                            if (matriz[i][j] == matriz[k][l]) {
                                temRepetidos = true;
                                break;
                            }
                        }
                    }
                    if (temRepetidos) {
                        break;
                    }
                }
                if (temRepetidos) {
                    break;
                }
            }
        }

        int pares = 0, impares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("\nResultados:");
        System.out.println("A matriz possui elementos repetidos: " + temRepetidos);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}