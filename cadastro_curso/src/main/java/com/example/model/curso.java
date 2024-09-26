package main.java.com.example.model;

import java.util.ArrayList;

public class curso {
    private String nomeCurso;
    private List<Aluno> alunos;
    private Professor professor;

    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
        alunos = new ArrayList<>();
    }

    public void addprof(Professor professor){

        this.professor = professor;

    }
    public void addaluno(Aluno aluno){
       alunos.add(aluno);
    }

    public void lancarNotas(String nomeAluno ,double notaAluno){
          for (Aluno aluno : alunos) {
            if(aluno.getNome().equalsIgnoreCase(nomeAluno)){
                aluno.setNota(notaAluno);
                System.out.println("Nota Inserida com Sucesso");
                return;
            }
            
          }
          System.out.println("Aluno Não Encontrado");
    }

    public void resultado(){
        for (Aluno aluno : alunos) {

            System.out.println(aluno.exibirAluno());

            aluno.avaliarDesempenho();
            
        }
    }
}
