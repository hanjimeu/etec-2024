public class NumDecres {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 50 - i; 
        }
        System.out.println("Números em ordem decrescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
