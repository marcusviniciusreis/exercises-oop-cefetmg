package projects.delegacao.domain;

import java.util.ArrayList;

public class Modalidade {
    private String descricao;
    private ArrayList<MembroDelegacao> membros = new ArrayList<>();
    private int limite;
    private int contador = 0;


    public Modalidade(String descricao, int limite) {
        this.descricao = descricao;
        this.limite = limite;
    }

    public void exibirDados(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Modalidade: " + descricao);
        System.out.println("Quantidade de membros: " + contador);

        for(MembroDelegacao membro: membros){
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println(membro.exibirDados());
        }

    }

    public void adicionarMembro(MembroDelegacao membro){
        if (this.limite > this.contador){
            membros.add(membro);
            this.contador++;
        }else System.out.println("Limite de membros excedidos!");

    }
    public void removerMembro(MembroDelegacao membro){
        if(membros.contains(membro)){
            membros.remove(membro);
            this.contador--;
        }else{
            System.out.println("Membro não encontrado!");
        }

    }
}
