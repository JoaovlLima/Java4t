package com.example;
import java.util.*;

public class ArraysasListExemplo {

    private String[] nomes = {"Maria", "João", "Pedro"};
    private List<String> nomesList;

    public ArraysasListExemplo(){
        nomesList = new ArrayList<>(Arrays.asList(nomes));
    }

    public void addArray(String nome){
        try {
            nomes[3] = nome;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addNome(String nome){
        nomesList.add(nome);
        System.out.println("Adicionado com sucesso");
    }

    public void listarNomes(){
        System.out.println(nomesList);
    }


    
}


