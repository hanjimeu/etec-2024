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
		
		System.out.print("Formação: ");
		formacao=sc.nextLine();
		
		System.out.print("Pretensão salarial: ");
		x=sc.nextDouble();
		
		
		if ((formacao.equalsIgnoreCase("análise de sistemas") || formacao.equalsIgnoreCase("analise de sistemas")  ) 
				&& escolaridade.equalsIgnoreCase ("superior completo") && x <=6000)  {
			System.out.println();
			System.out.println("Inscrição recebida");
			
		}else if(x >6000) {
			System.out.print("A faixa salarial da vaga está entre 5000 e 6000. Aceita continuar o processo?");
			
			String continuar = sc.next();
			if (continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s")) {
				System.out.println();
				System.out.println("Inscriçao recebida");
			
				
			}else {
				System.out.println();
				System.out.println("Agradecemos a disponibilidade - inscriçao interrompida");
			}
		}
		
		else {
			System.out.println();
			System.out.println("Não preenche os pré-requisitos para a vaga.");
		}
		
		
		
		 
		
	}

}