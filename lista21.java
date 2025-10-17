package primeiroProjeto;

import java.util.Scanner;

public class lista21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    
	    System.out.println("Digite dois números para somar:");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    System.out.println("Resultado da soma: " + somar(a, b));

	    
	    System.out.println("\nDigite dois números para subtrair:");
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    System.out.println("Resultado da subtração: " + subtrair(c, d));

	    
	    System.out.println("\nDigite dois números para multiplicar:");
	    int e = sc.nextInt();
	    int f = sc.nextInt();
	    System.out.println("Resultado da multiplicação: " + multiplicar(e, f));

	    
	    System.out.println("\nDigite dois números para dividir:");
	    double g = sc.nextDouble();
	    double h = sc.nextDouble();
	    System.out.println(dividir(g, h));

	    
	    System.out.println("\nDigite duas notas:");
	    double n1 = sc.nextDouble();
	    double n2 = sc.nextDouble();
	    System.out.println("Média: " + calcularMedia(n1, n2));

	    
	    System.out.println("Situação: " + verificarAprovacao(n1, n2));

	    
	    System.out.println("\nDigite dois números para verificar o maior:");
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    System.out.println(maiorNumero(x, y));

	    
	    System.out.println("\nDigite a temperatura em Celsius:");
	    double celsius = sc.nextDouble();
	    System.out.println("Em Fahrenheit: " + converterCelsiusParaFahrenheit(celsius));

	    
	    System.out.println("\nDigite a base e a altura do retângulo:");
	    double base = sc.nextDouble();
	    double altura = sc.nextDouble();
	    System.out.println("Área do retângulo: " + calcularAreaRetangulo(base, altura));

	    
	    System.out.println("\nDigite seu nome:");
	    sc.nextLine(); 
	    String nome = sc.nextLine();
	    System.out.println(gerarMensagem(nome));

	    
	    System.out.println("\nDigite dois nomes:");
	    String nome1 = sc.nextLine();
	    String nome2 = sc.nextLine();
	    System.out.println("Nomes juntos: " + juntarNomes(nome1, nome2));

	    
	    System.out.println("\nDigite sua idade:");
	    int idade = sc.nextInt();
	    System.out.println("Você é: " + avaliarIdade(idade));

	   
	}


	public static int somar(int a, int b) {
	    return a + b;
	}


	public static int subtrair(int a, int b) {
	    return a - b;
	}


	public static int multiplicar(int a, int b) {
	    return a * b;
	}


	public static String dividir(double a, double b) {
	    if (b == 0) {
	        return "Não é possível dividir por 0";
	    }
	    return "Resultado: " + (a / b);
	}


	public static double calcularMedia(double n1, double n2) {
	    return (n1 + n2) / 2;
	}


	public static String verificarAprovacao(double n1, double n2) {
	    double media = calcularMedia(n1, n2);
	    if (media >= 6) {
	        return "Aprovado";
	    } else {
	        return "Reprovado";
	    }
	}


	public static String maiorNumero(int a, int b) {
	    if (a > b) {
	        return "Maior número: " + a;
	    } else if (b > a) {
	        return "Maior número: " + b;
	    } else {
	        return "Eles são iguais";
	    }
	}


	public static double converterCelsiusParaFahrenheit(double celsius) {
	    return (celsius * 9 / 5) + 32;
	}


	public static double calcularAreaRetangulo(double base, double altura) {
	    return base * altura;
	}


	public static String gerarMensagem(String nome) {
	    return "Olá, " + nome + "!";
	}


	public static String juntarNomes(String nome1, String nome2) {
	    return nome1 + " " + nome2;
	}


	public static String avaliarIdade(int idade) {
	    if (idade < 12) {
	        return "Criança";
	    } else if (idade < 18) {
	        return "Adolescente";
	    } else if (idade < 60) {
	        return "Adulto";
	    } else {
	        return "Idoso";
	    }
	}
	
	}


