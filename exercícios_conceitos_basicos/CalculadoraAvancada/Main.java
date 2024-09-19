import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
       
   while(opcao!=6) {
        System.out.println("Calculadora Avançada");
        System.out.println("-----Escolha a Operação------- \n"+
        "1 - Soma\n"+
        "2 - Subtração\n"+
        "3 - Multiplicação\n"+
        "4 - Divisão\n"+
        "5 - Sair\n"+
        "-------------------------------");

        opcao = scanner.nextInt();
        scanner.nextLine(); 


        switch (opcao) {
            case 1:
                Soma();
                break;
                case 2:
                Subtracao();
                break;
                case 3:
                Multiplicacao();
                break;
                case 4:
                Divisao();
                break;
                case 5:
                System.out.println("Saindo .....");
             
                 break;
            default:
            System.out.println("Opção inválida. Tente novamente.");
                break;
        } 
        
    }
}
    public static void Soma(){

        System.out.println("Insira os numeros que serão somados");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        Operacao soma = new Soma(num1,num2);

        System.out.println(soma);

        System.out.print("Enter para continuar ");
        scanner.nextLine();
    }

    public static void Subtracao(){

        System.out.println("Insira os numeros que serão Subtraidos");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        Operacao subtracao = new Subtracao(num1,num2);

        System.out.println(subtracao);

        System.out.print("Enter para continuar ");
        scanner.nextLine();
    }

    public static void Multiplicacao(){

        System.out.println("Insira os numeros que serão Multiplicados");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        Operacao multiplicacao = new Multiplicacao(num1,num2);

        System.out.println(multiplicacao);

        System.out.print("Enter para continuar ");
        scanner.nextLine();
    }
    
    public static void Divisao() {
        try {
            System.out.println("Insira os números que serão divididos");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            // Verifica se o divisor é zero
            if (num2 == 0) {
                throw new ArithmeticException("Divisor não pode ser zero");
            }

            Operacao divisao = new Divisao(num1, num2);
            System.out.println(divisao);
        } catch (ArithmeticException e) {
            System.out.println("ERRO: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERRO: Ocorreu um erro inesperado.");
        } finally {
            System.out.print("Pressione Enter para continuar ");
            scanner.nextLine(); 
        }
    }
    
}