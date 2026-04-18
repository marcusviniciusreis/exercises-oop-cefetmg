package projects.agenda.domain;

import java.util.HashMap;


public class Agenda {
    private HashMap<String,Contato> contatos = new HashMap<>();

    public void adicionarContatos(Contato contato){
        contatos.put(contato.getNome(),contato);
    }


    public void pesquisarContato(String nome){
        System.out.println("---------PESQUISANDO CONTATO---------");
        Contato aux = contatos.get(nome);
        if (aux!=null){
            System.out.println("Nome: "+aux.getNome());
            System.out.println("Endereco: "+aux.getEndereco());
            System.out.println("Telefone: "+aux.getTelefone());
            System.out.println("Email: "+aux.getEmail());
        }else {
            System.out.println("Contato não encontrado!");
        }
    }



}
