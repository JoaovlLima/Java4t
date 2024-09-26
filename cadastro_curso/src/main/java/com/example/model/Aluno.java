package main.java.com.example.model;

public class Aluno extends Pessoa implements Avaliavel{
    private String materia;
    private double nota;

    
    public Aluno() {
    }
    
    public Aluno(String materia, double nota) {
        this.materia = materia;
        this.nota = nota;
    }

    public Aluno(String nome, int idade, String cpf, String materia, double nota) {
        super(nome, idade, cpf);
        this.materia = materia;
        this.nota = 0.0;
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
    public void setNota(double nota) {
        this.nota = nota;
    }
@Override
public String exibirAluno(){
    super.exibirInfo();
    return "mateira: "+ materia +" nota:" +nota;
}
@Override
public void avaliarDesempenho(){
    if (nota>=7){
        System.out.println("Aluno Aprovado");

    }else if (nota>=5){
        System.out.println("Aluno de Recuperação");
    }else{
        System.out.println("Aluno Reprovado");
    }
}
    
}
