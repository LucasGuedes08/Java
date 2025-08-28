package primeiroProjeto;

import java.util.Scanner;

public class Lista3 {

	public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       // Resultado de dois números
       int n1;
       int n2;
       System.out.println("Diga um número");
       n1 = scanner.nextInt();
       System.out.println("Agora diga outro");
       n2 = scanner.nextInt();
       int soma = n1 + n2;
       System.out.println("A soma desses dois números é: " + soma);
       
       // Divisão e Resto
       int num1;
       int num2;
       System.out.println("Me fale um número");
       num1 = scanner.nextInt();
       System.out.println("Me fale outro");
       num2 = scanner.nextInt();
       int div = num1 / num2;
       int resto = num1 % num2;
       System.out.println("A divisão desses números é: " + div + " E o resto é: " + resto);
       
       // Perímetro de um triângulo
       double lado1;
       double lado2;
       double lado3;
       System.out.println("Diga o tamanho de um lado do triângulo");
       lado1 = scanner.nextDouble();
       System.out.println("Diga o segundo lado");
       lado2 = scanner.nextDouble();
       System.out.println("O terceiro");
       lado3 = scanner.nextDouble();
       double perimetro = lado1 + lado2 + lado3;
       System.out.println("O perímetro desse triângulo é: " + perimetro);
       
       // Calculadora de Gorjeta
       double conta;
       double porcentagem;
       System.out.println("Qual o valor da conta?");
       conta = scanner.nextDouble();
       System.out.println("E qual a porcentagem de gorjeta desejada?");
       porcentagem = scanner.nextDouble();
       double gorjeta = conta * porcentagem / 100;
       double total = conta + gorjeta;
       System.out.println("O total à pagar é: " + total);
       
       // Calculadora de área de círculo
        double raio;
        System.out.println("Qual o raio em metros desse círculo?");
        raio = scanner.nextDouble();
        double area = 3.14159 * raio * raio;
        System.out.println("A área desse círculo é: " + area);
        
        // Conversor de idade em dias
        double idade; 
        System.out.println("Quantos anos você tem?");
        idade = scanner.nextDouble();
        double dias1 = idade * 365;
        double meses = idade * 12;
        double total1 = meses + dias1;
        System.out.println("Você tem: " + idade + " anos, " + meses + " meses e " + dias1 + " dias");
	
        // Calculadora de pagamento por hora
        double horas;
        double salarioh;
        System.out.println("Você trabalha quantas horas?");
        horas = scanner.nextDouble();
        System.out.println("E quanto você recebe por hora?");
        salarioh = scanner.nextDouble();
        double salariob = horas * salarioh;
        double imposto = salariob * 0.10;
        double salariol = salariob - imposto;
        System.out.println("O seu salário bruto é: " + salariob);
        System.out.println("O imposto fica: " + imposto);
        System.out.println("Então o seu salário líquido é " + salariol);
        
        
        
	}
}

