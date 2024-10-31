import java.util.Arrays;
import java.util.Collections;

public class NomeDecres  {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Adriel", "Beatriz", "Eduardo", "Fernanda", "Gabriel", "Giovanna", "Hisalana", "Igor", "Lucas", "Marcos", "Nicolas", "Oswald", "Pedro", "Quintino", "Rafael", "Saturnina", "Thiago", "Ulicis", "Vinicius"};
        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("Nomes em ordem decrescente: " + Arrays.toString(nomes));
    }
}