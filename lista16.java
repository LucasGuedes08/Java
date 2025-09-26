package primeiroProjeto;

import java.util.Scanner;

public class lista16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		  //  Criando um vetor de cores

        String[] cores = new String[6];
        for (int i = 0; i < cores.length; i++) {
            System.out.print("Digite uma cor: ");
            cores[i] = scanner.nextLine();
        }
        System.out.println("Cores digitadas:");
        for (String cor : cores) {
            System.out.println(cor);
        }
        

        // Vetor de números decimais
        
        double[] numeros = new double[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número decimal: ");
            numeros[i] = scanner.nextDouble();
        }
        System.out.println("Números decimais digitados:");
        for (double n : numeros) {
            System.out.println(n);
        }
        

        // Mostrando apenas os pares
        
        int[] inteiros = new int[10];
        for (int i = 0; i < inteiros.length; i++) {
            System.out.print("Digite um número inteiro: ");
            inteiros[i] = scanner.nextInt();
        }
        System.out.println("Números pares digitados:");
        for (int n : inteiros) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
        

        // Menores que 50

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            if (num < 50) {
                System.out.println("menor que 50");
            }
        }
        

        scanner.nextLine();

        //  Procurando um nome no vetor

        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = scanner.nextLine();
        }
        System.out.print("Digite um nome para procurar: ");
        String busca = scanner.nextLine();
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(busca)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome não encontrado!");
        }
       

        //  Produto e preço
        
        String[] produtos = new String[4];
        double[] precos = new double[4];
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto: ");
            produtos[i] = scanner.nextLine();
            System.out.print("Digite o preço do produto: ");
            precos[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
        }
       

        // Verificação de notas
        
        double[] notas = new double[6];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota: ");
            notas[i] = scanner.nextDouble();
        }
        for (double nota : notas) {
            if (nota < 6) {
                System.out.println("aluno reprovado");
            } else if (nota >= 6 && nota < 7) {
                System.out.println("aluno em recuperação");
            } else {
                System.out.println("aluno aprovado");
            }
        }
       

        // Promoção de ingressos
        
        double[] ingressos = new double[5];
        for (int i = 0; i < ingressos.length; i++) {
            System.out.print("Digite o preço do ingresso: ");
            ingressos[i] = scanner.nextDouble();
        }
        for (double ingresso : ingressos) {
            if (ingresso > 100) {
                System.out.println("Ingresso com promoção disponível!");
            }
        }

	}

}
