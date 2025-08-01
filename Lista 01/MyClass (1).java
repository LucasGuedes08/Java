public class MyClass {
  public static void main(String args[]) {
      // Cálculo para empresa
   double instalacao = 300;
   double limpeza = 150;
   double manutencao = 499.99;
   double soma = instalacao + limpeza + manutencao;
   System.out.println("O cliente deverá pagar: " + soma);
   
   System.out.print("\n");
   // Cálculo de salário 
   double salario = 35;
   double hora = 8;
   double salarioFinal = salario * hora;
   System.out.println("No final do dia ele deve receber: " + salarioFinal);
   
   System.out.print("\n");
   //  Caixas de bombons
   int bombom = 27;
   int caixa = 16;
   int resultado = bombom * caixa;
   System.out.println("Ela tem " + resultado);
   
   System.out.print("\n");
   // Garrafas de água
   int garrafa = 300;
   int caixas = 20;
   int usaram = garrafa / caixas;
   System.out.println("Eles usaram: " + usaram);
   
   System.out.print("\n");
   // Cálculo para camisetas 
   int c1 = 120;
   int vendeu = 80;
   int valor = 30;
   int c2 = 50;
   int v2 = c1 - vendeu;
   int dinheiro = vendeu * valor;
   int totalCamisetas = v2 + c2;
   System.out.println("Ele tem " + totalCamisetas);
   System.out.println("Ele faturou " + dinheiro);
   
   System.out.print("\n");
   //  Dobro e Metade
    double num1 = 10;
    double dobro = num1 * 2;
    double metade = num1 / 2;
    System.out.println("O dobro é " + dobro);
    System.out.println("A metade é " + metade);
   }
}