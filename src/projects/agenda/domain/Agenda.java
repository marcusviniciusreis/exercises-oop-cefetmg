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

    public void alterarNome(String nome, String novoNome){
        if(contatos.containsKey(nome)){
            Contato contato = contatos.get(nome);
            contatos.remove(nome);
            contatos.put(novoNome,contato);
        }
    }
    public void alterarEndereco(String nome,String endereco){
        if(contatos.containsKey(nome)){
            Contato aux = contatos.get(nome);
            aux.setEndereco(endereco);
            contatos.put(aux.getNome(),aux);
        }
    }
    public void alterarNumero(String nome,String numero){
        if(contatos.containsKey(nome)){
            Contato aux = contatos.get(nome);
            aux.setEndereco(numero);
            contatos.put(aux.getNome(),aux);
        }
    }
    public void alterarEmail(String nome, String email){
        if(contatos.containsKey(nome)){
            Contato aux = contatos.get(nome);
            aux.setEndereco(email);
            contatos.put(aux.getNome(),aux);
        }
    }

    public void listarContatos(){
        for(Contato aux : contatos.values()){
            System.out.println("------------------------");
            System.out.println("Nome: "+aux.getNome());
            System.out.println("Endereco: "+aux.getEndereco());
            System.out.println("Telefone: "+aux.getTelefone());
            System.out.println("Email: "+aux.getEmail());
        }
    }



}
