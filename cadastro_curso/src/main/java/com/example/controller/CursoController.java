package main.java.com.example.controller;

import main.java.com.example.model.Aluno;
import main.java.com.example.model.Professor;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CursoController {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Curso> cursos;

    public CursoController() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void addAlunoAoCurso(String nome, int idade, String cpf, String materia, String nota) {
        Aluno aluno = new Aluno(nome, idade, cpf, materia, nota);
        alunos.add(aluno);
        System.out.println("Aluno adicionado ao curso: " + aluno.getNome());
    }

    public void addProfessor(String nome, int idade, String cpf, String area, String classe) {
        Professor professor = new Professor(nome, idade, cpf, area, classe);
        professores.add(professor);
        System.out.println("Professor adicionado: " + professor.getNome());
    }

    public void exibirAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("Aluno: " + aluno.getNome() + ", Idade: " + aluno.getIdade() +
                        ", CPF: " + aluno.getCpf() + ", Matéria: " + aluno.getMateria() +
                        ", Nota: " + aluno.getNota());
            }
        }
    }

    public void exibirProfessores() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            for (Professor professor : professores) {
                System.out.println("Professor: " + professor.getNome() + ", Idade: " + professor.getIdade() +
                        ", CPF: " + professor.getCpf() + ", Área: " + professor.getArea() +
                        ", Classe: " + professor.getClasse());
            }
        }
    }

    public void cadastrarAlunoEmCurso(Professor professor, Aluno aluno, String curso) {

        if (professor.getArea().equalsIgnoreCase(curso)) {
            System.out.println("Aluno " + aluno.getNome() +
                    " foi cadastrado no curso: " + curso +
                    " Pelo professor: " + professor.getNome());

            cursos.add(professor, aluno, curso);
        } else {
            System.out.println("Esse curso não é da sua area");
        }
    }

    public void listarAlunoPeloCurso() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso Cadastrada");

        } else {
            for (int i = 0; i < cursos.length; i++) {
                System.out.println("Professor: " + cursos.professor.getNome() +
                        " Aluno: " + cursos.aluno.getNome() +
                        " Curso: " + cursos.curso);
            }

        }
    }
}
