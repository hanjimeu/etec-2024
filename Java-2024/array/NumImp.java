public class NumImp {
    public static void main(String[] args) {
        int[] numerosImpares = new int[100];
        for (int i = 0; i < numerosImpares.length; i++) {
            numerosImpares[i] = 2 * i + 1; 
        }
        System.out.println("Primeiros 100 números ímpares:");
        for (int numero : numerosImpares) {
            System.out.print(numero + " ");
        }
    }
}

