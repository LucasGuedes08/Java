package primeiroProjeto;

import java.util.Scanner;

public class lista12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		// Contador:
		int contador = 10;
		do {
			System.out.println(contador);
			contador++; 
		} while (contador <= 30);
		
		System.out.println("------------------------");
		
		// Adivinhação de número:
		int num;
		do {
			System.out.println("Diga um número:");
			num = scanner.nextInt();
		} while (num != 5);
		System.out.println("Número correto");
		
		System.out.println("------------------------");
		
		// Verificação de peso na mala:
		int peso;
		do {
			System.out.println("Qual o peso da mala (kg)?:");
			peso = scanner.nextInt();
			if(peso <= 23) {
				System.out.println("Dentro do limite");
			}else {
				System.out.println("Peso excedido");
			}
			
		}while(peso > 23);
		
		System.out.println("------------------------");
		
		//  Verificar quantidade de páginas lidas na semana:
		int totalpag = 0;
		int dias = 1;
		do {
			System.out.println("Você leu quantas páginas do livro hoje?");
			int pag = scanner.nextInt();
			totalpag = totalpag + pag;
			dias++;
			} while (dias <= 7);
		System.out.println("Você leu " + totalpag + " páginas");
		
		System.out.println("------------------------");
		
		// Testar código de acesso:
		int senha;
		do {
			System.out.println("Informe a senha de acesso:");
			senha = scanner.nextInt();
			if (senha == 987) {
				System.out.println("Acertou");
			}else {
				System.out.println("Errou");
			}
		}while(senha != 987);
		
		System.out.println("------------------------");
		
		// Verificar nível de combustivel:
		int comb;
		int v2 = 1;
		do {
			System.out.println("Qual o nível de combustível (litros)?: ");
			comb = scanner.nextInt();
			if (comb <= 10) {
				System.out.println("Combustível baixo");
				}
			v2++;
		}while(comb < 10);
		System.out.println("Combustível suficiente");
		
		System.out.println("------------------------");
		
		// Contar Kilômetros Percorridos:
		int distancia;
		int totalkm = 0;
		do {
			System.out.println("Digite a distância percorrida no trecho: ");
			distancia = scanner.nextInt();
			if(distancia > 0) {
				totalkm += distancia;
			}
		}while(distancia > 0);
		System.out.println("Total de km percorridos: " + totalkm);

		
		

		
	
		

		

	}

}
