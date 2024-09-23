package main.java.com.example.model;

public class Professor extends Pessoa {
    private String area;
    private String classe;

    public Professor(String nome, int idade, String cpf, String area, String classe) {
        super(nome, idade, cpf);
        this.area = area;
        this.classe = classe;
    }

    public Professor() {
    }

    public Professor(String area, String classe) {
        this.area = area;
        this.classe = classe;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }

    
}
