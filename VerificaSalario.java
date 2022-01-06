package avaliacao1;

import java.util.Scanner;

public class VerificaSalario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nomeFuncionario = scanner.nextLine();
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome(nomeFuncionario);
		
		
		System.out.println("Digite seu salario: ");
		int salarioFuncionario = scanner.nextInt();
		
		funcionario1.setSalario(salarioFuncionario);
		
		
		if(funcionario1.getSalario() <= 1000) {
			funcionario1.setBonus(salarioFuncionario / 100 * 20);
			int novoSalario  = funcionario1.getSalario() + funcionario1.getBonus();
			
			System.out.println("Seu nome é: " + funcionario1.getNome());
			System.out.println("Seu salario é de :R$" + funcionario1.getSalario());
			System.out.println("Seu bonus é de : R$" + funcionario1.getBonus());
			System.out.println("Seu novo salario é: R$" + novoSalario);
		}
		
		else if(funcionario1.getSalario() > 1000 && funcionario1.getSalario() <=2000) {
			funcionario1.setBonus(salarioFuncionario / 100 * 10);
			int novoSalario1  = funcionario1.getSalario() + funcionario1.getBonus(); 
			
			System.out.println("Seu nome é: " + funcionario1.getNome());
			System.out.println("Seu salario é de: R$" + funcionario1.getSalario());
			System.out.println("Seu bonus é de: R$" + funcionario1.getBonus());
			System.out.println("Seu salario é: R$" + novoSalario1);
		} else {
			funcionario1.setDesconto(salarioFuncionario / 100 * 10);
			int novoSalario3 = funcionario1.getSalario() - funcionario1.getDesconto();
			
			System.out.println("Seu nome é: " + funcionario1.getNome());
			System.out.println("Seu salario é de: R$" + funcionario1.getSalario());
			System.out.println("Seu desconto sera de: R$" + funcionario1.getDesconto());
			System.out.println("Seu salario é: R$" + novoSalario3);
		}
		
		
		
		System.out.println("Digite seu nome: ");
		String nomeFuncionario2 = scanner2.nextLine();
		Funcionario funcionario2 = new Funcionario();
		
		funcionario2.setNome(nomeFuncionario2);
		
		
		System.out.println("Digite seu salario: ");
		int salarioFuncionario2 = scanner2.nextInt();
		
		funcionario2.setSalario(salarioFuncionario2);
		
		
		if(funcionario2.getSalario() <= 1000) {
			funcionario2.setBonus(salarioFuncionario2 / 100 * 20);
			int novoSalario4  = funcionario2.getSalario() + funcionario2.getBonus();
			
			System.out.println("Seu nome é: " + funcionario2.getNome());
			System.out.println("Seu salario é de :R$" + funcionario2.getSalario());
			System.out.println("Seu bonus é de : R$" + funcionario2.getBonus());
			System.out.println("Seu novo salario é: R$" + novoSalario4);
		}
		
		else if(funcionario2.getSalario() > 1000 && funcionario2.getSalario() <=2000) {
			funcionario2.setBonus(salarioFuncionario2 / 100 * 10);
			int novoSalario5  = funcionario2.getSalario() + funcionario2.getBonus(); 
			
			System.out.println("Seu nome é: " + funcionario2.getNome());
			System.out.println("Seu salario é de: R$" + funcionario2.getSalario());
			System.out.println("Seu bonus é de: R$" + funcionario2.getBonus());
			System.out.println("Seu salario é: R$" + novoSalario5);
		} else {
			funcionario2.setDesconto(salarioFuncionario2 / 100 * 10);
			int novoSalario6 = funcionario2.getSalario() - funcionario2.getDesconto();
			
			System.out.println("Seu nome é: " + funcionario2.getNome());
			System.out.println("Seu salario é de: R$" + funcionario2.getSalario());
			System.out.println("Seu desconto sera de: R$" + funcionario2.getDesconto());
			System.out.println("Seu salario é: R$" + novoSalario6);
		}
		
		
		
		
		
	}
}
