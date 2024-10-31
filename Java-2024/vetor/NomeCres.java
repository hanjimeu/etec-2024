import java.util.Arrays;
public class NomeCrescente {
    public static void main(String[] args) {
      
        String[] nomes = {
            "Carlos", "Ana Cristina", "Bruno Luan", "Beatriz", "Felipe", 
            "Kyan", "Joana", "Eduarda", "Miriam", 
            "Nayara", "Mitski", "Helena", "Daniel", 
            "Isadora", "Tasha"};
        Arrays.sort(nomes);
        System.out.println("Nomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

