package com.example.Exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String senha = "postgres";
        Scanner sc = new Scanner(System.in);
        Connection conexao = null;

        try {
            // Conectando ao banco de dados PostgreSQL
            conexao = DriverManager.getConnection(url, usuario, senha);

            int opcao;
            do {
                // Exibe o menu de opções
                System.out.println("\nMenu:");
                System.out.println("1. Exibir todos os clientes");
                System.out.println("2. Adicionar um novo cliente");
                System.out.println("3. Atualizar o e-mail de um cliente");
                System.out.println("4. Excluir um cliente");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine(); // Consome a nova linha

                switch (opcao) {
                    case 1:
                        // Exibir todos os clientes
                        exibirClientes(conexao);
                        System.out.println("Sair? - (True ou False)");
                      Boolean sair = sc.nextBoolean();
                      if(sair == true){
                        break;
                      }
                    case 2:
                        // Adicionar um novo cliente
                        System.out.print("Digite o nome do cliente: ");
                        String nome = sc.nextLine();
                        System.out.print("Digite o e-mail do cliente: ");
                        String email = sc.nextLine();
                        adicionarCliente(conexao, nome, email);
                        break;
                    case 3:
                        // Atualizar o e-mail de um cliente
                        System.out.print("Digite o ID do cliente que deseja atualizar: ");
                        int idAtualizar = sc.nextInt();
                        sc.nextLine(); // Consome a nova linha
                        System.out.print("Digite o novo e-mail: ");
                        String novoEmail = sc.nextLine();
                        atualizarEmailCliente(conexao, idAtualizar, novoEmail);
                        break;
                    case 4:
                        // Excluir um cliente
                        System.out.print("Digite o ID do cliente que deseja excluir: ");
                        int idExcluir = sc.nextInt();
                        excluirCliente(conexao, idExcluir);
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 5);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexao != null) conexao.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }

    // Método para exibir todos os clientes
    public static void exibirClientes(Connection conexao) throws Exception {
        String sql = "SELECT id, nome, email FROM clientes";
        try (Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nLista de Clientes:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Nome: " + nome + ", E-mail: " + email);
            }
            System.out.println();
        }
    }

    // Método para adicionar um novo cliente
    public static void adicionarCliente(Connection conexao, String nome, String email) throws Exception {
        String sql = "INSERT INTO clientes (nome, email) VALUES (?, ?)";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            System.out.println("Cliente adicionado: " + nome);
        }
    }

    // Método para atualizar o e-mail de um cliente com base no ID
    public static void atualizarEmailCliente(Connection conexao, int id, String novoEmail) throws Exception {
        String sql = "UPDATE clientes SET email = ? WHERE id = ?";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, novoEmail);
            pstmt.setInt(2, id);
            int linhasAfetadas = pstmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("E-mail do cliente com ID " + id + " atualizado para: " + novoEmail);
            } else {
                System.out.println("Nenhum cliente encontrado com o ID " + id);
            }
        }
    }

    // Método para excluir um cliente com base no ID
    public static void excluirCliente(Connection conexao, int id) throws Exception {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int linhasAfetadas = pstmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Cliente com ID " + id + " excluído.");
            } else {
                System.out.println("Nenhum cliente encontrado com o ID " + id);
            }
        }
    }
}
