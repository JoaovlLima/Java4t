package com.example;
import java.util.*;

public class SetExemplo {
    private Set<String> nomes;

    public SetExemplo(){

        nomes = new HashSet<>();
    }
    public void addNome(String nome){
        nomes.add(nome);
        System.out.println(nomes.hashCode());
    }

    public void listarNomes(){
        System.out.println(nomes);
    }
    public void removerNomes(String nome){

        try {

            nomes.remove(nome);
            
        } catch (Exception e) {
        
            System.out.println(e);
        }

        

    }
    
}

    
