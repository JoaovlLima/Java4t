package main.java.com.example.model;

public class Aluno extends Pessoa {
    private String materia;
    private String nota;

    
    public Aluno() {
    }
    
    public Aluno(String materia, String nota) {
        this.materia = materia;
        this.nota = nota;
    }

    public Aluno(String nome, int idade, String cpf, String materia, String nota) {
        super(nome, idade, cpf);
        this.materia = materia;
        this.nota = nota;
    }

    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }

    
}
