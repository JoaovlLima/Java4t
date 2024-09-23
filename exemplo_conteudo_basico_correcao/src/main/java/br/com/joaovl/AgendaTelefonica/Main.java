package br.com.joaovl.AgendaTelefonica;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       AgendaTelefonica agenda = new AgendaTelefonica(5);
        int operador=0;
        try {
            
       
       do {
        
        System.out.println("----Agenda Telefonica-----");
        System.out.println("1- Adicionar");
        System.out.println("2- Listar Contato");
        System.out.println("3- Buscar Contato(nome)");
        System.out.println("4- Remover Contato(nome)");
        System.out.println("5- sair...");
        System.out.println("-------------------");

        try{
        operador = Integer.parseInt( JOptionPane.showInputDialog("Digite a Operação"));

        } catch (Exception e) {
            
        }
        switch (operador) {
            case 1:
try {
    String nome = JOptionPane.showInputDialog("Nome do contato");
            String telefone = JOptionPane.showInputDialog("Telefone do contato");
            Contato contato = new Contato(nome,telefone);
            agenda.addContato(contato);
} catch (Exception e) {
    // TODO: handle exception
}
            
                
                break;
                case 2:
                try {
                    agenda.listarContatos();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                
                break;
                case 3:
                try {
                    String nome = JOptionPane.showInputDialog("Insira o nome a ser Buscado");
                  agenda.BuscarContatos(nome);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                
                break;
                case 4:
                try {
                    String nomeExcluir = JOptionPane.showInputDialog("Insira o nome a ser Excluido");
                    agenda.excluirContatos(nomeExcluir);
                } catch (Exception e) {
                    // TODO: handle exception
                }
               
                break;
        
            default:
                break;
        }

       } while (operador !=5);

    } catch (Exception e) {
        
    }

    }
}
