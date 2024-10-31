public class NumDecres {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        for (int i = 0; i < 50; i++) {
            numeros[i] = 50 - i;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
