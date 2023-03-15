import java.util.Scanner;

public class LH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner entrada = new Scanner(System.in);
		
	    System.out.println("Digete a sua idade: ");
		double num1 = entrada.nextDouble();
		
	    System.out.println("Digite o seu peso: ");
		double num2 = entrada.nextDouble();
		
		double resultado = (num1 + num2);
		
		if(resultado >= 20) {
			
			double soma = resultado + 5;
			System.out.println("O resultado + 5 deu: " + soma);
			
		}
		
		else if(resultado <= 8){
			
	   double mult = resultado * 8;
	   System.out.println("O resultado x8 é de :" + mult );
	   
		}
	
	}

}
