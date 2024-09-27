package com.example.LeituraCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AlunoIOReader {

    String arquivo = "C:\\Users\\DevTarde\\Documents\\joaoLima\\Java4t\\Notas.csv";
    List<Aluno> alunos;
    double mediaTurma = 0;

     public AlunoIOReader() {
        alunos = new ArrayList<>();
        readerFileIO();
     }

    public void readerFileIO(){
       
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            String divisor = ",";
            while ((linha = br.readLine()) != null) {
                String[] conteudo = linha.split(divisor);
               Aluno aluno = new Aluno(
                    conteudo(0), 
                    Double.parseDouble(conteudo(1)),
                    Double.parseDouble(conteudo(2)),
                    Double.parseDouble(conteudo(3))

                );
                alunos.add(aluno);
        }
    
        
    } catch (IOException e) {
        e.printStackTrace();
    };
    }
    public double mediaAluno(){
        for (Aluno aluno : alunos) {
            mediaTurma += aluno.mediaNotas();
        }
        mediaTurma/=alunos.size();
        return mediaTurma;
    }

    public String alunoMaiorNota(){
        String nomeAluno = "";
        double maiorNota = 0;
        for (Aluno aluno : alunos) {
            
            if (maiorNota<aluno.maiorNota()) {
                maiorNota = aluno.maiorNota();
                nomeAluno = aluno.getNome();
                
            }
            
        }
        return "aluno com maior nota é" +nomeAluno+ " Nota: "+maiorNota;
    }

}

