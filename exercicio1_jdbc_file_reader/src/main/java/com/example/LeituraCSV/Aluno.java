package com.example.LeituraCSV;
import java.util.*;
public class Aluno {
    private String nome;
    List<Double> notas = new ArrayList<>();
    double media;


    public Aluno (String nome, double nota1, double nota2, double nota3){
        this.nome=nome;
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
    }
public String getNome(){
    return nome;
}
    public double mediaNotas(){
        
        for (Double nota : notas) {
            media+= nota;
            
        }
        media/=notas.size();
        return media;

    }
    public double maiorNota(){
        double maiorNota = 0;
        for (Double nota : notas) {
            if(nota>maiorNota){
                maiorNota=nota;
            }
            
        }
        return maiorNota;
    }
    public double menorNota(){
        double menorNota = 10;
        for (Double nota : notas) {
            if(menorNota>nota){
                menorNota=nota;
            }
            
        }
        return menorNota;
    }
}
