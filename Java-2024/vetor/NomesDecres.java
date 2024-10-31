import java.util.Arrays;
import java.util.Collections;
public class NomesDecres {
    public static void main(String[] args) {
        String[] nomes = {
          "Carlos", "Ana Cristina", "Bruno Luan", "Beatriz", "Felipe", 
            "Kyan", "Joana", "Eduarda", "Miriam", 
            "Nayara", "Mitski", "Helena", "Daniel", 
            "Isadora", "Tasha"};
        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("Nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}