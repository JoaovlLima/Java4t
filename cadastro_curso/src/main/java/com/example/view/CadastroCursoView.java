package main.java.com.example.view;

public class CadastroCursoView {
    public void cadastro(){

    int opcao;

        do {
            
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar Professor");
            System.out.println("2. Adicionar Aluno");
            System.out.println("3. exibir Informação Aluno");
            System.out.println("4. Exibir informação Professor");
            System.out.println("5. Cadastro Aluno a curso");
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
    }

