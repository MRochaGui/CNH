package application;

import java.util.Scanner;

public class Ac2Cnh {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double aprov;

		System.out.println(	"Para receber sua CNH, é necessário que você tenha sido aprovado nos exames: Psicoténico, legislativo e de direção.\n"); 
		// uma mensagem explicativa pro usuario ^
		
		System.out.println("Se você foi aprovado nos 3 exames digite 1, se não digite 2.");
		aprov = ler.nextDouble(); // guardando dados.
		ler.close(); // economia de memoria

		if (aprov == 1) {
			System.out.printf("Parabéns, você está apto a receber sua CNH."); // caso aprovado aparecera essa msg
		}

		else if (aprov == 2) {
			System.out.printf("Você não está apto a receber sua CNH."); // caso nao aptidao aparecera essa msg
		} else {
			System.out.println("Número digitado inválido."); // importante pois o usuario pode digitar outros numeros.
		}
	}
}
