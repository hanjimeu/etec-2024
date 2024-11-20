import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        inicializaTabuleiro(tabuleiro);
        boolean fimDeJogo = false;
        int jogador = 1; 
        int jogadas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo da Velha!");
        System.out.println("Para marcar uma posição, digite a linha e a coluna (1-3).");

        while (!fimDeJogo && jogadas < 9) {
            imprimeTabuleiro(tabuleiro);

            System.out.print("Jogador " + jogador + ", é sua vez! ");
            int linha = scanner.nextInt() - 1;
            int coluna = scanner.nextInt() - 1;

            if (verificaJogadaValida(tabuleiro, linha, coluna)) {
                marcaTabuleiro(tabuleiro, linha, coluna, jogador);
                fimDeJogo = verificaVitoria(tabuleiro, jogador) || verificaEmpate(tabuleiro);
                jogadas++;

                if (fimDeJogo) {
                    if (verificaVitoria(tabuleiro, jogador)) {
                        System.out.println("Jogador " + jogador + " venceu!");
                    } else {
                        System.out.println("Empate!");
                    }
                }

                jogador = (jogador == 1) ? 2 : 1;
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }
        imprimeTabuleiro(tabuleiro);
    }

    private static boolean verificaVitoria(char[][] tabuleiro, int jogador) {
        char simbolo = (jogador == 1) ? 'X' : 'O';
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) {
                return true;
            }
            if (tabuleiro[0][i] == simbolo && tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo) {
                return true;
            }
        }
        if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) {
            return true;
        }
        if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo) {
            return true;
        }
        return false;
    }

    private static boolean verificaEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void inicializaTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    private static void imprimeTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean verificaJogadaValida(char[][] tabuleiro, int linha, int coluna) {
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-';
    }

    private static void marcaTabuleiro(char[][] tabuleiro, int linha, int coluna, int jogador) {
        tabuleiro[linha][coluna] = (jogador == 1) ? 'X' : 'O';
    }
}