package primeiroProjeto;

public class lista20 {

	public static void main(String[] args) {
		
				
		 // Funções sem parâmetro
        saudacao();
        espaco();
        retangulo();
        espaco();
        multiplosDe5();
        espaco();
        contagem();
        espaco();
        meses();
        espaco();

        // Funções com parâmetro
        verificarDivisivelPor5(25);
        espaco();
        despedida("Lucas");
        espaco();
        unirNomes("Lucas", "Guedes");
        espaco();
        verificarMaiorQue100(88);
        espaco();
        classificarVelocidade(90);
        espaco();
        saudacaoPorDia("terça");
        espaco();
        verificarEstoque(3);
        espaco();
    }

    // ---------------------- FUNÇÕES SEM PARÂMETRO ----------------------

    // 1 – Repetindo uma saudação
    public static void saudacao() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bom dia!");
        }
    }

    // 2 – Desenhando um retângulo
    public static void retangulo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("*****");
        }
    }

    // 3 – Imprimindo múltiplos de 5
    public static void multiplosDe5() {
        for (int i = 5; i <= 25; i += 5) {
            System.out.println(i);
        }
    }

    // 4 – Exibindo uma contagem crescente
    public static void contagem() {
        for (int i = 1; i <= 8; i++) {
            System.out.println(i);
        }
        System.out.println("Pronto!");
    }

    // 5 – Mostrando os meses do ano
    public static void meses() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        for (String mes : meses) {
            System.out.println(mes);
        }
    }

    // ---------------------- FUNÇÕES COM PARÂMETRO ----------------------

    // 1 – Verificando divisibilidade
    public static void verificarDivisivelPor5(int numero) {
        if (numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5.");
        } else {
            System.out.println(numero + " não é divisível por 5.");
        }
    }

    // 2 – Mensagem de despedida
    public static void despedida(String nome) {
        System.out.println("Até logo, " + nome + "!");
    }

    // 3 – Unindo nomes
    public static void unirNomes(String nome1, String nome2) {
        System.out.println("Nome completo: " + nome1 + " " + nome2);
    }

    // 4 – Verificando maior que 100
    public static void verificarMaiorQue100(int numero) {
        if (numero > 100) {
            System.out.println(numero + " é maior que 100.");
        } else {
            System.out.println(numero + " não é maior que 100.");
        }
    }

    // 5 – Classificando velocidade
    public static void classificarVelocidade(int velocidade) {
        if (velocidade < 40) {
            System.out.println("Lenta");
        } else if (velocidade <= 80) {
            System.out.println("Normal");
        } else {
            System.out.println("Rápida");
        }
    }

    // 6 – Saudação por dia da semana
    public static void saudacaoPorDia(String dia) {
        System.out.println("Tenha uma ótima " + dia + "!");
    }

    // 7 – Verificando situação de estoque
    public static void verificarEstoque(int quantidade) {
        if (quantidade >= 10) {
            System.out.println("Estoque suficiente");
        } else if (quantidade >= 5) {
            System.out.println("Estoque baixo");
        } else {
            System.out.println("Estoque crítico");
        }
    }

    // Função auxiliar para deixar o console mais organizado
    public static void espaco() {
        System.out.println("----------------------");
    }
}