package analise_formacao_vaga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double x;
		
		String nome, escolaridade, formacao;
		
		System.out.print("Nome do Canditado: ");
		nome=sc.nextLine();
		
		System.out.print("Grau de escolaridade: ");
		escolaridade=sc.nextLine();
		
		System.out.print("Forma��o: ");
		formacao=sc.nextLine();
		
		System.out.print("Pretens�o salarial: ");
		x=sc.nextDouble();
		
		
		if ((formacao.equalsIgnoreCase("an�lise de sistemas") || formacao.equalsIgnoreCase("analise de sistemas")  ) 
				&& escolaridade.equalsIgnoreCase ("superior completo") && x <=6000)  {
			System.out.println();
			System.out.println("Inscri��o recebida");
			
		}else if(x >6000) {
			System.out.print("A faixa salarial da vaga est� entre 5000 e 6000. Aceita continuar o processo?");
			
			String continuar = sc.next();
			if (continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s")) {
				System.out.println();
				System.out.println("Inscri�ao recebida");
			
				
			}else {
				System.out.println();
				System.out.println("Agradecemos a disponibilidade - inscri�ao interrompida");
			}
		}
		
		else {
			System.out.println();
			System.out.println("N�o preenche os pr�-requisitos para a vaga.");
		}
		
		
		
		 
		
	}

}