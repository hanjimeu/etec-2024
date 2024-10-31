public class NumPar {
    public static void main(String[] args) {
        int[] numerosPares = new int[100];
        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = 2 * (i + 1); 
        }
        System.out.println("Primeiros 100 números pares:");
        for (int numero : numerosPares) {
            System.out.print(numero + " ");
        }
    }
}
