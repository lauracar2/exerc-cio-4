import java.util.Scanner;

public class L23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Digite o número a: ");
	 double a = entrada.nextDouble();
	 
	 System.out.println("Digite o número b: ");
	 double b = entrada.nextDouble();
	 
	 System.out.println("Digite o número c: ");
	 double c = entrada.nextDouble();
	 
	 System.out.println("Digite a número d: ");
	 double d = entrada.nextDouble();
	 
	 double x = (a + b * c - d) / (b * c + d - a);
	 double y = (b - d * a + c) / (c - a + c * b);
	 
	 System.out.println("O valor de x é: " + x);
	 System.out.println("O valor de y é: " + y);
	 
	 entrada.close();
	}

}
