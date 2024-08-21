package com.example.Exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio4 {
    public static void main(String[] args) {
        String arquivoEntrada = "produtosEx4.csv";
        String arquivoSaida = "produtosEx4_com_valor_total.csv";

        String linha;
        String divisor = ",";
        String produtoMaiorValor = "";
        double maiorValor = Double.MIN_VALUE;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoEntrada));
             BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSaida))) {

            // Lendo a primeira linha (cabeçalho)
            linha = br.readLine();
            bw.write(linha + ",valor_total_estoque\n");

            // Processando cada linha do arquivo CSV
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(divisor);
                String nome = valores[0];
                int quantidade = Integer.parseInt(valores[1]);
                double preco = Double.parseDouble(valores[2]);

                // Calculando o valor total do estoque para o produto
                double valorTotalEstoque = quantidade * preco;

                // Verificando o produto com o maior valor total em estoque
                if (valorTotalEstoque > maiorValor) {
                    maiorValor = valorTotalEstoque;
                    produtoMaiorValor = nome;
                }

                // Escrevendo a linha original no novo arquivo com o valor total adicionado
                bw.write(String.join(divisor, valores) + divisor + valorTotalEstoque + "\n");
            }

            // Exibindo o produto com o maior valor total em estoque
            System.out.println("Produto com maior valor total em estoque: " + produtoMaiorValor + " (Valor: R$ " + maiorValor + ")");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
