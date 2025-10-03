package primeiroProjeto;

public class lista18 {

	public static void main(String[] args) {
		nome();
		treco();
		frase();
		treco();
		contagem();
		treco();
		vogais();
		treco();
		quadrado();
		treco();
		pares();
		treco();
		regressiva();
		treco();
		tri();
		treco();
		semana();
		treco();
		

	}
public static void nome () {
	for (int n = 1; n< 10; n++) {
	System.out.println("Lucas");
	}
}
	
 public static void treco() {
System.out.println("-------------------------------------");
}


public static void frase() {
	System.out.println("O sucesso é a soma de pequenos esforços repetidos todos os dias.");
}
	
	
public static void  contagem () {
	for (int i = 1; i <= 10; i++) {
		System.out.println(i);
		
	}
}

public static void vogais() {
	System.out.println("| A | E | I | O | U |");
}

public static void quadrado() {
	for(int p= 0; p<4; p++) {
		
			System.out.println("**** ");
		}
	}

public static void pares() {
	for(int pp=1; pp<=20; pp++) {
		if (pp % 2 == 0) {
			System.out.println("impressão: " + pp);
			
		}
	}
}

public static void regressiva() {
	for(int rr = 10; rr>0; rr--) {
	System.out.println(rr);
	}
	System.out.println("                       Fim");
}


public static void tri() {
	System.out.println("*");
	System.out.println("**");
	System.out.println("***");
	System.out.println("****");
	System.out.println("*****");
}

public static void semana() {
	System.out.println("DOMINGO");
	System.out.println("SEGUNDA-FEIRA");
	System.out.println("TERÇA-FEIRA");
	System.out.println("QUARTA-FEIRA");
	System.out.println("QUINTA-FEIRA");
	System.out.println("SEXTA");
	System.out.println("SÁBADO");
	
}
	

	
}
