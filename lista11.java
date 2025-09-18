package primeiroProjeto;

import java.util.Scanner;

public class lista11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1 - Contador de 1 a 31, pulando de 2 em 2
        int i = 1;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 31);

        // 2 - Adivinhação de número
        int numero;
        do {
            System.out.print("Digite um número (100 para sair): ");
            numero = scanner.nextInt();
        } while (numero != 100);
        System.out.println("Acertou, número 100!");

        // 3 - Menu interativo
        int opcao;
        do {
            System.out.println("Menu: 1 - Continuar | 2 - Sair");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu continuar!");
            } else if (opcao != 2) {
                System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 2);
        System.out.println("Programa encerrado!");

        // 4 - Classificação de números
        int contador = 1;
        do {
            System.out.print("Digite um número: ");
            int n = scanner.nextInt();

            if (n < 10) {
                System.out.println("Tipo A");
            } else if (n < 20) {
                System.out.println("Tipo B");
            } else {
                System.out.println("Fora da Categoria");
            }
            contador++;
        } while (contador <= 5);

        // 5 - Temperatura do forno
        int temp;
        do {
            System.out.print("Digite a temperatura do forno: ");
            temp = scanner.nextInt();

            if (temp >= 200) {
                System.out.println(" Temperatura muito alta! Digite novamente.");
            }
        } while (temp >= 200);
        System.out.println(" Temperatura segura!");

        // 6 - Verificação de bateria
        int bateria;
        do {
            System.out.print("Digite o nível da bateria (%): ");
            bateria = scanner.nextInt();

            if (bateria <= 20) {
                System.out.println(" Bateria baixa! Conecte o carregador.");
            }
        } while (bateria <= 20);
        System.out.println(" Bateria em nível seguro!");

        // 7 - Deseja fazer uma conta?
        String resposta;
        do {
            System.out.print("Deseja fazer uma conta? (sim/não): ");
            resposta = scanner.next();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.print("Digite o primeiro número: ");
                int a = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int b = scanner.nextInt();
                System.out.println("Resultado da soma: " + (a + b));
            }

        } while (resposta.equalsIgnoreCase("sim"));
        
		

	}

}
