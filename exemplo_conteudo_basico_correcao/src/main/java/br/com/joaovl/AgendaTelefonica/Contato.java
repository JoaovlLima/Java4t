package br.com.joaovl.AgendaTelefonica;

public class Contato {
     public static final String Remover = null;
    private String nome;
     private String telefone;

     
    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

     
}
