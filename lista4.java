package primeiroProjeto;

import java.util.Scanner;

public class lista4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		//  Verificar maioridade
        int idade;
        System.out.println("Quantos anos você tem?");
        idade = scanner.nextInt();
        if (idade >= 18) {
        	System.out.println("Você tem " + idade + " anos e é maior de idade");
        } else {
        	System.out.println("Você tem " + idade + " anos e é menor de idade");
        }
        
        // Comparar dois números
        double n1;
        double n2;
        System.out.println("Me diga um número");
        n1 = scanner.nextDouble();
        System.out.println("Diga outro");
        n2 = scanner.nextDouble();
        if (n1 > n2) {
        	System.out.println("O primeiro é maior que o segundo");
        } else {
        	System.out.println("O segundo é maior que o primeiro ou eles são iguais");
        }
        
        // Aprovação por nota
        double nota;
        System.out.println("Qual foi a sua nota");
        nota = scanner.nextDouble();
        if (nota >= 7) {
        	System.out.println("Aprovado: sua nota foi " + nota );
        } else {
        	System.out.println("Reprovado; sua nota foi " + nota);
        }
        
        // Verificar número positivo
        double numero;
        System.out.println("Diga um número");
        numero = scanner.nextDouble();
        if (numero > 0) {
        	System.out.println("O número é positivo");
        } else {
        	System.out.println("O número é negativo ou zero");
        }
        
        // Cálculo de frete
        double loc;
        System.out.println("Qual a distância da entrega? ");
        loc = scanner.nextDouble();
        if (loc <= 50) {
        	System.out.println("O frete custa R$10,00");
        } else {
        	double frete = loc * 0.5;
        	System.out.println("Valor do frete: R$ " + frete);
        }
        
        // O Número é 10?
        double num1;
        System.out.println("Escreva um número");
        num1 = scanner.nextDouble();
        if (num1 == 10) {
        	System.out.println("O número é 10");
        } else {
        	System.out.println("O número não é 10");
        }
        
        // Desconto para Associados
        String palavra;
        System.out.println("Você é associado a loja?");
        palavra = scanner.next();
        if (palavra == "sim") {
        	System.out.println("Você tem desconto ");
        } else {
        	System.out.println("Você não tem desconto");
        }
        
        // Cálculo de bônus por horas extras
        double horaExtra;
        System.out.println("Você trabalhou quantas horas extras?");
        horaExtra = scanner.nextDouble();
        if (horaExtra < 10) {
        	System.out.println("Bônus por hora extra R$20,00" );
        } else {
        	System.out.println("Bônus por hora extra R$15,00");
        }


 
       



	}

}
