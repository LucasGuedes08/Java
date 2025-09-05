package primeiroProjeto;

import java.util.Scanner;

public class lista8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Classificação de Dia da Semana
		
		System.out.println("Diga um número de 1 a 7 que represente um dia da semana");
		int dia = scanner.nextInt();
		switch(dia) {
		case 1:
			System.out.println("Fim de semana");
			break;
		case 2:
			System.out.println("Dia útil");
			break;
		case 3:
			System.out.println("Dia útil");
			break;
		case 4:
			System.out.println("Dia útil");
			break;
		case 5:
			System.out.println("Dia útil");
			break;
		case 6: 
			System.out.println("Dia útil");
			break;
		case 7:
			System.out.println("Fim de semana");
			break;
			default:
				System.out.println("Dia inválido");
		}
		
		// Menu de Bebidas
        System.out.println("Qual o código da bebida?");
        System.out.println("1- Café");
        System.out.println("2- Chá");
        System.out.println("3- Suco");
        System.out.println("4- Refrigerante");
        int cod = scanner.nextInt();
        switch(cod) {
        case 1:
        	System.out.println("R$5,00");
        	break;
        case 2:
        	System.out.println("R$3,50");
        	break;
        case 3:
        	System.out.println("R$4,00");
        	break;
        case 4:
        	System.out.println("R$4,50");
        	break;
        	default:
        		System.out.println("Código inválido");
        	
        }
        
        //  Tipo de Veículo
        System.out.println("Qual o código de veículo?");
        System.out.println("1- Carro");
        System.out.println("2- Moto");
        System.out.println("3- Caminhão");
        int codigo = scanner.nextInt();
        switch(codigo) {
        case 1:
        	System.out.println("Leve");
        	break;
        case 2:
        	System.out.println("Motocicleta");
        	break;
        case 3:
        	System.out.println("Pesado");
        	break;
        	default:
        		System.out.println("Veículo inválido");
        }

        // Escolha de Plano de Assinatura
        System.out.println("Insira o código do plano");
        System.out.println("1- Básico");
        System.out.println("2- Intermediário");
        System.out.println("3- Premium");
        int cod2 = scanner.nextInt();
        switch(cod2) {
        case 1:
        	System.out.println("Acesso limitado");
        	break;
        case 2:
        	System.out.println("Acesso padrão + suporte");
        	break;
        case 3:
        	System.out.println("Acesso total + suporte prioritário");
        	break;
        	default:
        		System.out.println("Plano inválido");
        }
        
        // Seleção de Mês
        System.out.println("Diga um número de 1 a 12 que represente um mês");
        int mes = scanner.nextInt();
        switch(mes) {
        case 12, 1, 2:
        	System.out.println("Verão");
        break;
        case 3, 4, 5:
        	System.out.println("Outono");
        break;
        case 6, 7, 8:
        	System.out.println("Inverno");
        break;
        case 9, 10, 11:
        System.out.println("Primavera");
        break;
        default:
        	System.out.println("Mês inválido");
        }
        
        // Tipo de Ingresso
        System.out.println("Qual o código do ingresso?");
        System.out.println("1- Inteira");
        System.out.println("2- Meia-entrada");
        System.out.println("3- VIP");
        int codigo2 = scanner.nextInt();
        switch(codigo2) {
        case 1:
        	System.out.println("R$50,00");
        	break;
        case 2:
        	System.out.println("R$25,00");
        	break;
        case 3:
        	System.out.println("R$100,00");
        	break;
        	default:
        		System.out.println("Ingresso inválido");
        		
        	}
        
        // Escolha de Idioma
        System.out.println("Insira o código do idioma");
        System.out.println("1- Português");
        System.out.println("2- Inglês");
        System.out.println("3- Espanhol");
        int idioma = scanner.nextInt();
        switch(idioma) {
        case 1:
        	System.out.println("Olá!");
        	break;
        case 2:
        	System.out.println("Hello!");
        	break;
        case 3:
        	System.out.println("Hola!");
        	break;
        	default:
        		System.out.println("Idioma inválido");
        }

        //  Nível de Acesso
        System.out.println("Diga o código do nível");
        System.out.println("1- Usuário");
        System.out.println("2- Moderador");
        System.out.println("3- Administrador");
        int codigos = scanner.nextInt();
        switch(codigos) {
        case 1:
        	System.out.println("Acesso básico");
        	break;
        case 2:
        	System.out.println("Acesso básico + edição");
        	break;
        case 3:
        	System.out.println("Acesso total");
        	break;
        	default:
        		System.out.println("Nível inválido");
        }
       
        // Tipo de Pagamento
        System.out.println("Qual código de pagamento?");
        System.out.println("1- Dinheiro");
        System.out.println("2- Cartão de Crédito");
        System.out.println("3- Pix");
        int codigo3 = scanner.nextInt();
        switch(codigo3) {
        case 1:
        	System.out.println("Pagamento em dinheiro confirmado");
        	break;
        case 2:
        	System.out.println("Pagamento com cartão processado");
        	break;
        case 3:
        	System.out.println("Pagamento via Pix realizado");
        	break;
        	default:
        		System.out.println("Método inválido");
        }

	}

}
