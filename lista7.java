package primeiroProjeto;

import java.util.Scanner;

public class lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        // Classificação de Filme
        System.out.println("Quantos anos você tem?");
        int idade = scanner.nextInt();
        if(idade < 16 || idade > 70) {
        	System.out.println("Classificação especial");
        } else {
        	System.out.println("Classificação regular");
        }
        // Promoção de Produto
        System.out.println("Qual valor o produto?");
        double valor = scanner.nextDouble();
        System.out.println("Qual foi a quantidade comprada?");
        double quant = scanner.nextInt();
        double total = valor * quant;
        double desc = total * 0.15;
        double desctotal = total - desc;
        if(total > 200 && quant > 5) {
        	System.out.println("Você vai pagar: " + desctotal);
        	}else {
        		System.out.println("Você não ganhou desconto e vai pagar " + total);
        	}
        
        // Alerta de Saúde
        System.out.println("Qual a frequência cardíaca?");
        double freq = scanner.nextDouble();
        System.out.println("Sente tontura?");
        String tontura = scanner.next();
        if(freq >= 100 || tontura.equalsIgnoreCase("sim")) {
        	System.out.println("Procure atendimento médico");
        } else {
        	System.out.println("Sem sinais de alerta");
        }
        
        // Participação em Concurso
        System.out.println("Qual sua idade?");
        int idade2 = scanner.nextInt();
        System.out.println("É residente do estado?");
        String estado = scanner.next();
        if(idade2 >= 18 && idade2 <= 30 && estado.equalsIgnoreCase("sim")) {
        	System.out.println("Elegível para concurso");
        }else {
        	System.out.println("Não elegível para concurso");
        }
        
        //  Recompensa por Desempenho
        System.out.println("Quantos projetos foram concluídos?");
        double concluido = scanner.nextDouble();
        System.out.println("E qual o número de erros?");
        double erro = scanner.nextDouble();
        if(concluido > 10 && erro < 3) {
        	System.out.println("Recompensa concedida");
        }else {
        	System.out.println("Sem recompensa");
        }
        
        //  Autorização para Viagem
        System.out.println("Quantos anos tem?");
        int idade3 = scanner.nextInt();
        System.out.println("Possui passsaporte válido?");
        String pass = scanner.next();
        if(idade3 >= 18 && pass.equalsIgnoreCase("sim")) {
        	System.out.println("Viagem autorizada");
        }else {
        	System.out.println("Viagem não autorizada");
        }
        
        // Aprovação em Curso Online
        System.out.println("Qual a nota final? (0 a 100)");
        double nota = scanner.nextDouble();
        System.out.println("Qual o número de aulas assistidas? (0 a 50)");
        double aula = scanner.nextDouble();
        if(nota >= 70 && aula >= 40) {
        	System.out.println("Aprovado");
        }else {
        	System.out.println("Reprovado");
        }
        
        // Controle de Irrigação
        System.out.println("Qual a umidade do solo? (%)");
        double umidade = scanner.nextDouble();
        System.out.println("E a temperatura?");
        double temp = scanner.nextDouble();
        if(umidade < 30 || temp > 30) {
        	System.out.println("Irrigação necessária");
        }else {
        	System.out.println("Irrigação não necesária");
        }
        
        //  Inscrição em Feira Profissional
        System.out.println("Qual a sua idade?");
        int idade4 = scanner.nextInt();
        System.out.println("Possui experiência prévia? (sim ou não)");
        String exp = scanner.next();
        if(idade >= 20 && idade4 <= 40 && exp.equalsIgnoreCase("sim")) {
        	System.out.println("Inscrição aceita");     
        	}else {
        		System.out.println("Inscrição não permitida");
        	}






	}

}
