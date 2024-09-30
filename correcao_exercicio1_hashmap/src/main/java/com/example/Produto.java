package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Produto {
    private String nome;
    private double preco;

    public String toString(){
      return "Nome: "+ nome+" Preço: "+preco; 
    }
};


