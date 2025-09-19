package primeiroProjeto;

import java.util.Scanner;

public class lista13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		// Contador:
		for (int contador = 10; contador <= 30; contador++) {
			System.out.println(contador);
		}
		  System.out.println("----------------------------");
		// Classificação de idades:
		for (int i = 1; i <= 10; i++) {
            System.out.print("Quantos anos você tem? " + i + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }
		  System.out.println("----------------------------");
        // Eleição
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o voto " + i + ": ");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    System.out.println("Votou no Candidato 1");
                    break;
                case 2:
                    System.out.println("Votou no Candidato 2");
                    break;
                case 3:
                    System.out.println("Votou no Candidato 3");
                    break;
                case 4:
                    System.out.println("Votou no Candidato 4");
                    break;
                case 5:
                    System.out.println("Voto Nulo");
                    break;
                case 6:
                    System.out.println("Voto em Branco");
                    break;
                default:
                    System.out.println("Voto Inválido");
            }
        }
        
        System.out.println("----------------------------");

        // Repetição de frase
        System.out.println("Digite uma frase: ");
        String frase = scanner.next();
        System.out.println("Digite um número: ");
        int repeticoes = scanner.nextInt();
        for (int i = 1; i <= repeticoes; i++) {
            System.out.println(frase);
        }
	
        System.out.println("----------------------------");
	// Sequência
	for (int i = 50; i >= 30; i--) {
        System.out.println(i);
    }
	  System.out.println("----------------------------");
	// Números alternados
	 for (int i = 1; i <= 50; i += 2) {
		 
         System.out.println(i);
     }
	  System.out.println("----------------------------");
	 // Aprovado ou Reprovado 
	 for (int i = 1; i <= 5; i++) {
         System.out.print("Digite a nota " + i + ": ");
         double nota = scanner.nextDouble();

         if (nota >= 7.0) {
             System.out.println("Aprovado");
         } else {
             System.out.println("Reprovado");
         }
     }
	  System.out.println("----------------------------");
	 // Categoria de idade
	 for (int i = 1; i <= 5; i++) {
         System.out.print("Quantos anos você tem? " + i + ": ");
         int idade = scanner.nextInt();

         if (idade <= 12) {
             System.out.println("Criança");
         } else if (idade <= 17) {
             System.out.println("Adolescente");
         } else if (idade <= 59) {
             System.out.println("Adulto");
         } else {
             System.out.println("Idoso");
         }
     }
	  System.out.println("----------------------------");
     // Número positivo ou negativo
     for (int i = 1; i <= 7; i++) {
         System.out.print("Digite um número " + i + ": ");
         double numero = scanner.nextDouble();

         if (numero > 0) {
             System.out.println("Positivo");
         } else if (numero < 0) {
             System.out.println("Negativo");
         } else {
             System.out.println("Zero");
         }
     }
	}
}
