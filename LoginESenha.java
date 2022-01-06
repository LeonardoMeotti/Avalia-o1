package avaliacao1;


import java.time.LocalTime;

import java.util.Scanner;

public class LoginESenha {
	public static void main(String[] args) {
	
	LocalTime horaAgora = LocalTime.now();
	LocalTime horaEspecifica = LocalTime.parse("06:00:00");
	LocalTime horaEspecifica1 = LocalTime.parse("11:59:00");
	LocalTime horaEspecifica2 = LocalTime.parse("12:00:00");
	LocalTime horaEspecifica3 = LocalTime.parse("17:59:00");
	LocalTime horaEspecifica4 = LocalTime.parse("18:00:00");
	LocalTime horaEspecifica5 = LocalTime.parse("23:59:00");
	LocalTime horaEspecifica6 = LocalTime.parse("00:00:00");
	LocalTime horaEspecifica7 = LocalTime.parse("05:59:00");
	
	System.out.println(LocalTime.now());
	
	Scanner scanner = new Scanner(System.in);
	
	Registro leo = new Registro();
	
	leo.setUsuario("leonardo meotti");
	leo.setSenha("leo123");
	
	
	System.out.println("Digite seu usuario: ");
	String checaUsuario = scanner.nextLine();
	
	System.out.println("Digite sua senha : ");
	String checaSenha = scanner.nextLine();
	
	if (checaUsuario.equals(leo.getUsuario()) && checaSenha.equals(leo.getSenha())) {
		if (horaAgora.isAfter(horaEspecifica) && horaAgora.isBefore(horaEspecifica1)) {  
			System.out.println("Bom dia, você se logou ao nosso sistema");
		}	
		else if (horaAgora.isAfter(horaEspecifica2) && horaAgora.isBefore(horaEspecifica3)) {
			System.out.println("Boa tarde, você se logou ao nosso sistema");
		}
		else if(horaAgora.isAfter(horaEspecifica4) && horaAgora.isBefore(horaEspecifica5)) {
			System.out.println("Boa noite, você se logou ao nosso sistema");
		}
		else if(horaAgora.isAfter(horaEspecifica6) && horaAgora.isBefore(horaEspecifica7)) {
			System.out.println("Boa madrugada, você se logou ao nosso sistema");
		}
		
		}	else {	
		System.out.println("Usuario ou senha estão incorretos");
	}
	
	}
}
