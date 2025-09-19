package primeiroProjeto;

import java.util.Scanner;

public class lista14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Contador:
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println(contador);
		}
		 System.out.println("-------------------");
		// Somando números de 1 a 100
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			soma += i;
		}
		System.out.println("A soma dos números de 1 a 100 é: " + soma);
		
		 System.out.println("-------------------");
		 
		// Imprimir números pares de 1 a 20:
		 for(int n = 0; n <= 20; n++) {
			int div = n % 2;
			if(div == 0) {
				System.out.println("Par");
			} 
		 }
		 System.out.println("-------------------");
		 // Imprimir a tabuada de um número 
	        
	        System.out.print("Digite um número inteiro: ");
	        int num = scanner.nextInt();
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
	        System.out.println("-------------------");
	        
	        // Contar números divisíveis por 3:
	       
	        int contDiv3 = 0;
	        for (int i = 1; i <= 50; i++) {
	            if (i % 3 == 0) {
	                contDiv3++;
	            }
	        }
	        System.out.println("Quantidade de números divisíveis por 3: " + contDiv3);
	        
	        System.out.println("-------------------");
	        // Imprimir números ímpares de 1 a N:

	       
	        System.out.print("Digite um número inteiro N: ");
	        int n = scanner.nextInt();
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 != 0) {
	                System.out.println(i);
	            }
	        }
	       
	        System.out.println("-------------------");
	        // Multiplicação de valores:
            
	        int multiplicacao = 1;
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Digite o " + i + "º valor: ");
	            int valor = scanner.nextInt();
	            multiplicacao *= valor;
	        }
	        System.out.println("Resultado da multiplicação: " + multiplicacao);
	       
	        System.out.println("-------------------");
	        // Premiação da empresa:
	        
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Informe os anos de empresa do funcionário " + i + ": ");
	            int anos = scanner.nextInt();
	            if (anos > 10) {
	                System.out.println("Parabéns! Você irá receber um prêmio");
	            } else {
	                System.out.println("Quase lá");
	            }
	        }

	}

}
