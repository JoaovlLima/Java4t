import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoFuncionarios {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Calcular Média Salarial");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
        
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 4:
                    calcularMediaSalarial();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

   
    public static void adicionarFuncionario() {
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); 

        Funcionario novoFuncionario = new Funcionario(nome, idade, salario);
        funcionarios.add(novoFuncionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

   
    public static void removerFuncionario() {
        try {
            System.out.print("Digite o nome do funcionário a ser removido: ");
            String nome = scanner.nextLine();

            boolean removido = false;
            for (Funcionario f : funcionarios) {
                if (f.getNome().equalsIgnoreCase(nome)) {
                    funcionarios.remove(f);
                    System.out.println("Funcionário removido com sucesso!");
                    removido = true;
                    break;
                }
            }

            if (!removido) {
                throw new Exception("Funcionário não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    
    public static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("\n--- Lista de Funcionários ---");
            for (Funcionario f : funcionarios) {
                System.out.println(f.toString());
            }
        }
        System.out.print("Enter para continuar ");
        scanner.nextLine();
    }

   
    public static void calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado para calcular a média salarial.");
        } else {
            double somaSalarios = 0;
            for (Funcionario f : funcionarios) {
                somaSalarios += f.getSalario();
            }
            double media = somaSalarios / funcionarios.size();
            System.out.printf("A média salarial é: R$ %.2f\n", media);
        }
        System.out.print("Enter para continuar ");
        scanner.nextLine();
    }
}
