package projects.agenda.domain;

import java.util.HashMap;


public class Agenda {
    private HashMap<String,Contato> contatos = new HashMap<>();

    public void adicionarContatos(Contato contato){
        contatos.put(contato.getNome(),contato);
    }

}
