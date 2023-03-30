import java.util.Scanner;

public class A23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
	
		System.out.println("Digite o seu gênero (M ou F): ");
		String genero = ent.nextLine();
		
		if(genero.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		}
	
	    if(genero.equalsIgnoreCase("F")) {
	    	
	    	System.out.println("Feminino");
	    }
	    ent.close();
}
}
