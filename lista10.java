package primeiroProjeto;

import java.util.Scanner;

public class lista10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		// Contador:
		int contador = 10;
		while(contador <= 30) {
			System.out.println(contador);
			contador++;
		}
		
		// Soma de Números Digitados:
		int c = 1;
		int soma = 0;
		
		while(c <= 3) {
			System.out.println("Digite o número " + c + ":");
			int n = scanner.nextInt();
			soma = soma + n;
			c++;
			
		}
		 System.out.println("Soma é: " + soma);
		 
		 System.out.println("---------------------");
		// Multiplicação de Números Digitados:
		int cont = 1;
		int mult = 1;
		
		while(cont <= 5) {
			System.out.println("Escreva o número " + cont + ":");
			int num = scanner.nextInt();
			mult = mult * num;
			cont++;
		}
		System.out.println("A multiplicação é: " + mult);
		
		System.out.println("---------------------");
		
		// Contar até o número informado:
		System.out.println("Digite um número");
		int n1 = scanner.nextInt();
		int n2 = 1;
		while (n2 <= n1) {
        System.out.println(n2);
		n2++;
	}
		System.out.println("---------------------");
		
		//  Somar os números de 1 a 5:
		int n3 = 1;
		int so = 0;
		while(n3 <= 5) {
			so += n3;
			n3++;
			
		}
		System.out.println("A soma dos números de 1 a 5 é: " + so);
		
		System.out.println("---------------------");
		
		// Tabuada
		System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        int i = 1;
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }

        

}
	
}
