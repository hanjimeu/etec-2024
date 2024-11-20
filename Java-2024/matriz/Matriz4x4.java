import java.util.Scanner;

public class Matriz4x4 {
    public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("\nDiagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3 - i] + " ");
        }
    }
}