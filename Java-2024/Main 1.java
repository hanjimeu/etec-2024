import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			  double x, y, media;
			  
	System.out.print("Digite a primeira nota: ");
	x = sc.nextDouble();
	
	System.out.print("Digite a segunda nota: ");
	y = sc.nextDouble();
			
	media = (x + y)/2;
	
	System.out.println("A m�dia � " + media);
	
	}

}
