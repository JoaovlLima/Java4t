package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vendas vendas = new Vendas();
        int operacao;
        do {
            
          operacao = Integer.parseInt(JOptionPane.showInputDialog(
        "-------Gerenciamento de Vendas--------\n"+
          "1- Cadastrar Venda\n"+
          "2- Listar Vendas por Cpf\n"+
          "3- Listar Vendas por Cpf e Valor Minimo\n"+
          "4- Sair"
          ));

          switch (operacao) {
            case 1:

              String cpfVenda = JOptionPane.showInputDialog(
                "Informe o CPF do Cliente");
            String nomeProduto = JOptionPane.showInputDialog(
                "Informe o nome do Produto");
                double precoProduto = Double.parseDouble(JOptionPane.showInputDialog(
                    "Informe o Valor do Produto"));

                Produto produto = new Produto(nomeProduto, precoProduto);
                vendas.cadastroVenda(cpfVenda, produto);
            JOptionPane.showMessageDialog(null,"Produto Cadastrado com sucesso", nomeProduto, operacao);
                break;
                case 2:
                String cpfCliente = JOptionPane.showInputDialog(
                    "Informe o Cpf do Cliente"
                    );
                    System.out.println(vendas.listarProdutosCpf(cpfCliente).toString());
                
                break;
                case 3:
               String cpfClientefiltro = JOptionPane.showInputDialog(
                "Informe o Cpf do Cliente");
                double valorMinimo = Double.parseDouble(JOptionPane.showInputDialog(
                    "Informe o Valor minimo da compra"));
                
                    try {
                        System.out.println(vendas.listarProdutosFiltro(cpfClientefiltro, valorMinimo).toString());
                    } catch (Exception e) {
                       
                    }
                break;
                case 4:
                System.out.println("Saindo ......");
                operacao = 4;
                
                break;
          
            default:
               System.out.println("Opção não identificada");
                break;
          }

        } while (operacao != 4 );
    }
}