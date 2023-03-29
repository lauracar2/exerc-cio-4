import java.util.Scanner;

public class A23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
	
		System.out.println("Olá tudo bem ? Preciso que me informe o seu nome: ");
		String nome = ent.next();
		
		System.out.println("olá " + nome);
		
		System.out.println("Me informe a sua idade: ");
		int num = ent.nextInt();
		
		System.out.println("preciso conferir a sua renda, para poder disponibilizar o seu empréstimo");
		System.out.println("Me informe a renda: ");
		int num2 = ent.nextInt();
		
		if(num2 >= 1400) {
			
			System.out.println(nome + " parabéns você foi aprovado(a):)");
		}
		else {
			System.out.println(nome + " me desculpe não foi dessa vez :( ");
		}
		ent.close();
	}

}
