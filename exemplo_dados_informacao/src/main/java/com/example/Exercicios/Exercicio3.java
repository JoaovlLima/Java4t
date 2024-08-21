package com.example.Exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercicio3 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String senha = "postgres";

        Connection conexao = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Conectando ao banco de dados PostgreSQL
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();

            // Executando a consulta
            String sql = "SELECT nome, preco FROM produtos";
            rs = stmt.executeQuery(sql);

            // Inicializando variáveis para armazenar informações dos produtos
            String produtoMaisCaro = "";
            String produtoMaisBarato = "";
            double maiorPreco = Double.MIN_VALUE;
            double menorPreco = Double.MAX_VALUE;
            double somaPrecos = 0;
            int totalProdutos = 0;

            // Processando os resultados
            System.out.println("Lista de produtos:");
            while (rs.next()) {
                String nome = rs.getString("nome");
                double preco = rs.getDouble("preco");

                System.out.println("Nome: " + nome + ", Preço: " + preco);

                // Verificando o produto mais caro
                if (preco > maiorPreco) {
                    maiorPreco = preco;
                    produtoMaisCaro = nome;
                }

                // Verificando o produto mais barato
                if (preco < menorPreco) {
                    menorPreco = preco;
                    produtoMaisBarato = nome;
                }

                somaPrecos += preco;
                totalProdutos++;
            }

            // Calculando a média de preços
            double mediaPrecos = somaPrecos / totalProdutos;

            // Exibindo as informações finais
            System.out.println("\nProduto mais caro: " + produtoMaisCaro + " (Preço: " + maiorPreco + ")");
            System.out.println("Produto mais barato: " + produtoMaisBarato + " (Preço: " + menorPreco + ")");
            System.out.println("Média de preços dos produtos: " + mediaPrecos);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Fechando os recursos
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conexao != null) conexao.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
