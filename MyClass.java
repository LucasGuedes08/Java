public class MyClass {
  public static void main(String args[]) {
    
    // Váriaveis
    int idade = 16; // Números inteiros 
    double salario = 1.75; // Números quebrados 
    char letra = 'L'; // Letra ou símbolo
    boolean estudante = true; // Verdadeiro ou falso // True or false
    String nome = "Lucas"; // Texto
    
    System.out.println(idade);
    System.out.println("Minha idade é " + idade);
    System.out.println("O salário é " + salario);
    System.out.println("A letra é " + letra);
    System.out.println("Você é estudante? " + estudante);
    System.out.println("Meu nome é " + nome);
    
    // Operadores Aritméticos
    int n1 = 5;
    int n2 = 3;
    int soma = n1 + n2;
    int sub = n1 - n2;
    int mult = n1 * n2;
    double div = n1 / n2;
    System.out.println("Soma " + soma);
    System.out.println("Subtração " + sub);
    System.out.println("Multiplicação " + mult);
    System.out.println("Divisão " + div);
    
    /* Cálculo da área de um Retângulo*/
    /* Largura * Comprimento*/
    double largura = 7.5;
    double comprimento = 3.0;
    double area = largura * comprimento;
    System.out.println("A área do retângulo é " + area);
    
    // Cálculo de desconto
    double valor = 100;
    double desconto = 15; // 15%
    double valorDesconto = valor * (desconto / 100);
    double valorFinal = valor - valorDesconto;
    System.out.println("A pagar " + valorFinal);
  }
}