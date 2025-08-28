package primeiroProjeto;

import java.util.Scanner;

public class Lista5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Classificação de idade
		int idade;
        System.out.println("Quantos anos você tem?");
        idade = scanner.nextInt();
        if(idade < 12) {
        	System.out.println("Criança");
        } else if (idade < 17) {
        	System.out.println("Adolescente");
        } else if (idade < 59) {
        	System.out.println("Adulto");
        } else {
        	System.out.println("Idoso");
        }
        
        //Avaliação de Temperatura
        int temp;
        System.out.println("Qual é a temperatura?");
        temp = scanner.nextInt();
        if(temp < 10) {
        	System.out.println("Muito frio");
        } else if (temp < 20) {
        	System.out.println("Frio");
        } else if (temp < 30) {
        	System.out.println("Agradável");
        } else {
        	System.out.println("Muito quente");
        }
        
        //Sistema de Notas Escolares
        int nota;
        System.out.println("Qual foi a nota?");
        nota = scanner.nextInt();
        if(nota > 90) {
        	System.out.println("A");
        } else if (nota > 80) {
        	System.out.println("B");
        } else if (nota > 70) {
        	System.out.println("C");
        } else if (nota > 60) {
        	System.out.println("D");
        } else {
        	System.out.println("F");
        }
        
        // Verificação de senha
        System.out.println("Qual a senha?");
        String senha = scanner.next();
        if(senha.equalsIgnoreCase ("admin")) {
        	System.out.println("Acesso permitido!");
        } else {
        	System.out.println("Acesso negado!");
        }
        
        // Comparação de nomes
        String nome1;
        String nome2;
        System.out.println("Fale um nome");
        nome1 = scanner.next();
        System.out.println("Fale outro");
        nome2 = scanner.next();
        if(nome1.equalsIgnoreCase(nome2)) {
        	System.out.println("Os nomes são iguais");
        } else {
        	System.out.println("Os nomes são diferentes");
        }
        
        // Jogo da cor favorita
        System.out.println("Qual sua cor favorita?");
        String cor = scanner.next();
        if(cor.equalsIgnoreCase("azul")) {
        	System.out.println("Boa escolha!");
        } else if (cor.equalsIgnoreCase("vermelho")) {
        	System.out.println("Cor vibrante!");
        } else if (cor.equalsIgnoreCase("verde")) {
        	System.out.println("Cor da natureza!");
        } else {
        	System.out.println("Cor não cadastrada");
        }
        
        // Verificação de vogal
        System.out.println("Digite uma letra");
        String letra = scanner.next();
        if (letra.equalsIgnoreCase("a")) {
        	System.out.println("É uma vogal");
        } else if (letra.equalsIgnoreCase("e")) {
        	System.out.println("É uma vogal");
        } else if (letra.equalsIgnoreCase("i")) {
        	System.out.println("É uma vogal");
        } else if (letra.equalsIgnoreCase("o")) {
        	System.out.println("É uma vogal");
        } else if (letra.equalsIgnoreCase("u")) {
        	System.out.println("É uma vogal");
        } else {
        	System.out.println("Não é uma vogal");
        }
       
        
	}

}
