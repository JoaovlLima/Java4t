package br.com.joaovl.AgendaTelefonica;

public class AgendaTelefonica {
    private Contato[] contatos;
    private int contador;

    public AgendaTelefonica(int maxContato) {
        contatos = new Contato[maxContato];
        contador = 0;
    }

    public void addContato(Contato contato) throws AgendaCheiaExeption {

        if (contador >= contatos.length) {

            throw new AgendaCheiaExeption("Agenda Cheia");

        }

        contatos[contador] = contato;
        contador++;

        System.out.println("Contato adicionado");

    }

    public void listarContatos() {
        if (contador == 0) {
            System.out.println("Lista Vazia");

        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(contatos[i].getNome()+ contatos[i].getTelefone());
            }
        }
    }

    public void excluirContatos(String nome) throws ContatoNaoExistenteException {
      boolean encontrado = false;
            for (int i = 0; i < contador; i++) {
             
                
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    encontrado = true;
                    contatos[i] = contatos[contador-1];
                    contatos[contador-1] = null;
                    contador--;
                    System.out.println("Contato removido com sucesso");
                    
                   
               
                    

                }

            }
            if (encontrado == false) {
                throw new ContatoNaoExistenteException("Contato não encontrado");
            }
           
        }
    

    public Contato BuscarContatos(String nome) throws ContatoNaoExistenteException {
       
            for (int i = 0; i < contador; i++) {

                if (contatos[i].getNome().equalsIgnoreCase(nome)) {

                    
                  System.out.println(contatos[i].getNome()+" "+contatos[i].getTelefone());
                    

                }

            }
            throw new ContatoNaoExistenteException("Contato não encontrado");
        }
    
}
