package br.com.joaovl.AgendaTelefonica;

public class ContatoNaoExistenteException extends Exception{
    public ContatoNaoExistenteException(String mensagem) {
        super(mensagem);
    }
}
