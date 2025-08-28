package primeiroProjeto;

import java.util.Scanner;

public class Lista6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		// Intervalo numérico
		System.out.println("Diga um número");
		int n1 = scanner.nextInt();
		if (n1 >= 10 && n1 <= 20) {
			System.out.println("Número dentro do intervalo");
		} else {
			System.out.println("Fora do intervalo");
		}
		
		// Acesso à festa
		
		System.out.println("Quantos anos você tem?");
		int idade = scanner.nextInt();
		System.out.println("Possui convite? true/false");
		boolean entrada = scanner.nextBoolean();
		
		if(idade >= 18 && entrada) {
			System.out.println("Entrada permitida");
		} else {
			System.out.println("Entrada não permitida");
		}
		
		// Categoria de esporte
		System.out.println("Qual a sua idade?");
		int idade1 = scanner.nextInt();
		if(idade1 < 12 || idade1 > 60) {
			System.out.println("Categoria especial");
		} else {
			System.out.println("Categoria normal");
		}
		
		//  Desconto no produto
		System.out.println("Qual o valor do produto?");
		double valor = scanner.nextDouble();
		System.out.println("Qual a forma de pagamento?");
		String pag = scanner.next();
	    if(valor > 100 && pag.equalsIgnoreCase("avista") ) {
	    	double desconto = valor * 0.10;
	    	double vd = valor - desconto;
			System.out.println("Você pagará " + vd);
		} else {
			System.out.println("Você pagará " + valor);
		}

       // Triagem médica
	    System.out.println("Qual a sua temperatura?");
	    double temp = scanner.nextDouble();
	    System.out.println("Tem sintomas?");
	    String sintomas = scanner.next(); 
	    if(temp >= 38 || sintomas.equalsIgnoreCase("sim")) {
	    	System.out.println("Recomenda-se procurar um médico.");
	    } else {
	    	System.out.println("Sem sinais preocupantes.");
	    }
	    
	    //  Votação
	    System.out.println("Quantos anos você tem?");
	    int idade2 = scanner.nextInt();
	    System.out.println("É brasileiro?");
	    String nac = scanner.next();
	    if(idade2 >= 16 && nac.equalsIgnoreCase("sim")) {
	    	System.out.println("Pode votar");
	    } else {
	    	System.out.println("Não pode votar");
	    }
	    
	    // Bônus de funcionário
	    System.out.println("Qual foi a quantidade de horas extras?");
	    double horaExtra = scanner.nextDouble();
	    System.out.println("Qual o número de faltas?");
	    double faltas = scanner.nextDouble();
	    if(horaExtra > 20 && faltas < 5) {
	    	System.out.println("Ganhou bônus");
	    } else {
	    	System.out.println("Não ganhou bônus");
	    }
	    
	    //  Autorização para dirigir
	    System.out.println("Qual a sua idade?");
	    int idade3 = scanner.nextInt();
	    System.out.println("Possui carteira de motorista?");
	    String carteira = scanner.next();
	    if(idade3 >= 18 && carteira.equalsIgnoreCase("sim")) {
	    	System.out.println("Pode dirigir");
	    } else {
	    	System.out.println("Não pode dirigir");
	    }
	    
	    // Elegibilidade para Bolsa de Estudos
	    System.out.println("Qual sua nota?' (0 a 10)");
		double nota = scanner.nextDouble();
		System.out.println("Qual sua frequência? (0 a 100)");
		int frequencia = scanner.nextInt();
		
		if(nota >= 8 || frequencia >= 80){
		System.out.println("Bolsa concedida");
		} else {
		System.out.println("Bolsa não concedida");
		}
		
		// Verificação de Temperatura Ambiente
		 // 10
        System.out.print("Temperatura ambiente: ");
        double temperatura = scanner.nextDouble();
        System.out.print("Umidade (%): ");
        double umidade = scanner.nextDouble();
        if((temperatura < 18 || temperatura > 26) && umidade > 60) {
            System.out.println("Ajustar climatização");
        } else {
            System.out.println("Climatização não necessária");
        }


	    		

	}

}
