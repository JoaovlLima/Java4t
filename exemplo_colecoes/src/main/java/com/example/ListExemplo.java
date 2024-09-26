package com.example;
import java.util.*;

public class ListExemplo {

    private List<String> nomes;

    public ListExemplo(){
        nomes = new ArrayList<>();
    }

    public void addList(String nome){
        nomes.add(nome);
        System.out.println(nomes.lastIndexOf(nome));
    }

    public void listarNomes(){
        System.out.println(nomes);
    }
    public void removerNomes(String nome){

        try {

            nomes.remove(nome.lastIndexOf(nome));
            
        } catch (Exception e) {
        
            System.out.println(e);
        }

        

    }
    public void modificarNome(String nomeAntigo, String nomeNovo){

        try {
            
            nomes.set(nomes.indexOf(nomeAntigo),nomeNovo);

            System.out.println("Nome Alterado com sucesso");

        } catch (Exception e) {

            System.out.println(e);
        }

    }
}
