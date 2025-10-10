package primeiroProjeto;

import java.util.Scanner;

public class NotasAulas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String resposta = "sim";

        while (resposta.equalsIgnoreCase("sim")) { 
            System.out.println("SISTEMA DE GESTÃO DE NOTAS");

            System.out.println("\nNome do Aluno:");
            String nome = scanner.next();

            System.out.println("Ano:");
            String ano = scanner.next();

            System.out.println("Insira a primeira nota:");
            double nota1 = scanner.nextDouble();

            System.out.println("Insira a segunda nota:");
            double nota2 = scanner.nextDouble();

            System.out.println("Insira a terceira nota:");
            double nota3 = scanner.nextDouble();

            if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
                System.out.println("Valor inválido! Insira notas entre 0 e 10.");
            } else {
                double media = (nota1 + nota2 + nota3) / 3;
                System.out.println("Média: " + media);

                String resultado;
                if (media < 5) {
                    resultado = "Reprovado";
                } else if (media >= 5 && media < 7) {
                    resultado = "Recuperação";
                } else {
                    resultado = "Aprovado";
                }

                System.out.println("Nome do aluno: " + nome);
                System.out.println("Ano: " + ano);
                System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
                System.out.println("Média: " + media);
                System.out.println("Classificação: " + resultado);
            }

            System.out.print("\nDeseja calcular as notas de outro aluno? (sim/não): ");
            resposta = scanner.next();
            System.out.println(); // pula uma linha pra deixar mais bonito
        }

        System.out.println("Programa encerrado!");
        
    }
}
