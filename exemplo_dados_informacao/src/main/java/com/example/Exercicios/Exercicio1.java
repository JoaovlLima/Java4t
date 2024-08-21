package com.example.Exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio1 {
     public void LeituraTxt() {
       
            String alunoMaiorNota = "";
            String alunoMenorNota = "";
            double maiorNota = Double.MIN_VALUE;
            double menorNota = Double.MAX_VALUE;
    
            try (BufferedReader br = new BufferedReader(new FileReader("dadosEx1.txt"))) {
                String linha;
                String divisor = ",";
                while ((linha = br.readLine()) != null) {
                    String[] valores = linha.split(divisor);
                    
                    String nomeAluno = valores[0];
                    double somaNotas = 0;
                    int numeroNotas = valores.length - 1;
                    
                    for (int i = 1; i <= numeroNotas; i++) {
                        somaNotas += Double.parseDouble(valores[i]);
                    }
                    
                    double media = somaNotas / numeroNotas;
                    System.out.println("Nome: "+nomeAluno+" Média: "+media);
                    // Atualiza o aluno com a maior média
                    if (media > maiorNota) {
                        maiorNota = media;
                        alunoMaiorNota = nomeAluno;
                    }
                    
                    // Atualiza o aluno com a menor média
                    if (media < menorNota) {
                        menorNota = media;
                        alunoMenorNota = nomeAluno;
                    }
                }
            
                // Exibe os resultados
                System.out.println("Aluno com a maior média: " + alunoMaiorNota + " (Média: " + maiorNota + ")");
                System.out.println("Aluno com a menor média: " + alunoMenorNota + " (Média: " + menorNota + ")");
            
            } catch (IOException e) {
            e.printStackTrace();
        };
    }
}

