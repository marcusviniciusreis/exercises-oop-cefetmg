package projects.delegacao.domain;

import java.util.ArrayList;

public class Modalidade {
    private String descricao;
    private ArrayList<MembroDelegacao> membros;
    private int limite;
    private int contador = 0;

    public Modalidade(String descricao, int quantidadeMax) {
        this.descricao = descricao;
        this.limite = quantidadeMax;
    }

    public void adicionarMembro(MembroDelegacao membro){
        if (this.limite > this.contador){
            membros.add(membro);
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
