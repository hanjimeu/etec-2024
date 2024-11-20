import java.util.Scanner;

public class Matriz5x5 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int somaImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }
        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + j + ": " + somaColuna);
        }

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }

        System.out.println("\nSoma dos números ímpares: " + somaImpares);
    }
}
