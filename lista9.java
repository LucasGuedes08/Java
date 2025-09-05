package primeiroProjeto;

import java.util.Scanner;

public class lista9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		// Contador
		int numero = 1;
		while(numero <= 10) {
			System.out.println(numero);
			numero++;
		}
		System.out.println("\n");
		
		// Contagem regressiva
		int numero2 = 10;
		while(numero >= 1) {
			System.out.println(numero);
			numero--;
		}
		
		// Sequência numérica
		int num = 5;
		while(num <= 100) {
			System.out.println(num);
			num +=5;
		}
		
		// Mostrando mensagem
		int java = 1;
		while(java <= 5) {
			System.out.println("Eu gosto de Java");
			java++;
		
		}
		
		// Soma de Números Digitados
		int soma = 0;
		int contador = 1;
		int valor;
		System.out.println("Diga 5 números");
		while(contador <= 5) {
			valor = scanner.nextInt();
			soma += valor;
			contador += 1;
			}
		System.out.println("A soma dos números: " + soma);
		
		// Validação de Senha
		System.out.println("Qual a senha?");
		int senha = scanner.nextInt();
		while(senha != 1234) {
			System.out.println("Qual a senha?");
			senha = scanner.nextInt();
		}
		System.out.println("Senha correta");

		
		//  Contagem Regressiva
		System.out.println("Diga um número inteiro e positivo");
		int n2 = scanner.nextInt();
		while(n2 >= 1) {
			System.out.println(n2);
			n2--;
		}
	}

}
