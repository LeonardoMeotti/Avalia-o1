package avaliacao1;

import java.util.Scanner;

public class Quiz {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int correta = 0;
		int errada = 0;
		
		System.out.println("Qual seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Quem é o dono da Amazon?");
		System.out.println("(1) Elon Musk");
		System.out.println("(2) Bill Gates");
		System.out.println("(3) Jeff Bezos");
		System.out.println("(4) Steve Jobs");
		System.out.println("Responda conforme o numero");
		System.out.println("Digite sua resposta: ");
		
		String resposta = scanner.nextLine();
		if(resposta.equals("3")){
			System.out.println("Resposta Correta");
			correta++;
		} else {
			System.out.println("Resposta Errada");
			errada++;
		}
		
		
		System.out.println("Qual a criptomoeda mais valiosa atualmente?");
		System.out.println("(1) Dogecoin");
		System.out.println("(2) Etherium");
		System.out.println("(3) Binance Coin(BNB)");
		System.out.println("(4) Bitcoin");
		System.out.println("Responda conforme o numero");
		System.out.println("Digite sua resposta: ");
		
		String resposta2 = scanner.nextLine();
		if(resposta2.equals("4")){
			System.out.println("Resposta Correta");
			correta++;
		} else {
			System.out.println("Resposta Errada");
			errada++;
		}
		
		System.out.println("Qual o filme mais visto em 2021?");
		System.out.println("(1) Duna");
		System.out.println("(2) Homem aranha: Sem volta pra casa");
		System.out.println("(3) Tempo");
		System.out.println("(4) Candyman");
		System.out.println("Responda conforme o numero");
		System.out.println("Digite sua resposta: ");
		
		String resposta3 = scanner.nextLine();
		if(resposta3.equals("2")){
			System.out.println("Resposta Correta");
			correta++;
		} else {
			System.out.println("Resposta Errada");
			errada++;
		}
		
		System.out.println(nome + " esse é placar de respostas: " );
		System.out.println("Corretas: " + correta);
		System.out.println("Erradas: " + errada);
		
	}

}
