package primeiroProjeto;

import java.util.Scanner;



public class Lista2 {

	public static void main(String[] args) {
		// Resultado de dois números
        Scanner scanner = new Scanner(System.in);
		double n1;
		double n2;
		System.out.println("Me diga um número");
		n1 = scanner.nextDouble();
		System.out.println("Diga outro");
		n2 = scanner.nextDouble();
		double soma = n1 + n2;
		System.out.println("A soma é = " + soma);
		double sub = n1 - n2;
		System.out.println("A subtração é = " + sub);
		double mult = n1 * n2;
		System.out.println("A multiplicação é = " + mult);
		double div = n1 / n2;
		System.out.println("A divisão é = " + div);

		// Cálculo de temperatura
        double celsius;
        System.out.println("Informe uma temperatura em Celsius");
        celsius = scanner.nextDouble();
        double f = (celsius * 1.8) + 32;
        System.out.println("Essa temperatura em fahrenheit " + f);
        
        // Conversão de valor
        double real;
        System.out.println("Diga um valor em reais");
        real = scanner.nextDouble();
        double d = real / 5.70;
        System.out.println("Em dólar " + d);
        
        // Área do retângulo
        double base;
        double altura;
        System.out.println("Diga o valor da base do retângulo");
        base = scanner.nextDouble();
        System.out.println("Agora o valor da altura");
        altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("A área do retângulo é " + area);
        
        // Conversor de idade
        int idade;
        System.out.println("Quantos anos você tem?");
        idade = scanner.nextInt();
        int meses = idade * 12;
        System.out.println("Você ja viveu " + meses + " meses");
        
        //  Conversor de minutos para segundos
        int min;
        System.out.println("Me diga algum tempo em minutos");
        min = scanner.nextInt();
        int seg = min * 60;
        System.out.println("Esse tempo possui " + seg + " segundos");
        
        // Custo da compra
        double preco;
        double quan;
        System.out.println("Qual o valor do produto?");
        preco = scanner.nextDouble();
        System.out.println("Agora a quantidade comprada");
        quan = scanner.nextDouble();
        double total = preco * quan;
        System.out.println("O custo total será " + total);
        
        // Divisão de uma conta de restaurante
        double conta;
        double pessoas;
        System.out.println("Qual o valor total da conta?");
        conta = scanner.nextDouble();
        System.out.println("Estão em quantas pessoas?");
        pessoas = scanner.nextDouble();
        double pag = conta / pessoas;
        System.out.println("Cada pessoa deverá pagar " + pag);
        
        // Cálculo de troco
        double val;
        double val2;
        System.out.println("Qual o valor da compra?");
        val = scanner.nextDouble();
        System.out.println("Qual o valor pago?");
        val2 = scanner.nextDouble();
        double troco = val - val2;
        System.out.println("O seu troco é " + troco);
       
	}

}
