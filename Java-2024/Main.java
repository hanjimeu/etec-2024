import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    try(
        Scanner scanner = new Scanner(System.in)) {
        
        System.out.println("Por favor digite seu nome: ");
        var nome = scanner.next() + scanner.nextLine();
        System.out.println("Por favor digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o seu sexo: ");
        var sexo = scanner.next() + scanner.nextLine();
        System.out.println("Digite o endereço: ");
        var endereco = scanner.next() + scanner.nextLine();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite as observações");
        var observacoes = scanner.next() + scanner.nextLine();
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        double imc = peso / altura * altura;
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (sexo == "M") {
                System.out.println("Sexo: Masculino");
        }else{
                System.out.println("Sexo: Feminino");
        }
        System.out.println("Endereço: " + endereco);
        System.out.println("Altura: " + altura);
        System.out.println("Observações: " + observacoes);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + imc);
    }
}
    
}
