package projects.contabilidade.test;

import projects.contabilidade.contas.Concessionaria;
import projects.contabilidade.contas.Titulo;
import projects.contabilidade.controle.ControlePagamentos;
import projects.contabilidade.empregados.Assalariado;
import projects.contabilidade.empregados.AssalariadosComissionados;
import projects.contabilidade.empregados.Comissionados;
import projects.contabilidade.empregados.Terceirizado;

public class SistemaPagamentos {
    public static void main(String[] args) {
        ControlePagamentos controle = new ControlePagamentos();

        controle.adicionarPagamento(new Assalariado("Juninho", "Garcia", 100123222, 20));
        controle.adicionarPagamento(new Comissionados("Marcus", "Filho", 122996, 1000));
        controle.adicionarPagamento(new Terceirizado("Joao", "Lasmar", 1222226, 40));
        controle.adicionarPagamento(new AssalariadosComissionados("Joao", "Lasmar", 1222226, 500));
        controle.adicionarPagamento(new Concessionaria(8,5,2000));
        controle.adicionarPagamento(new Titulo(8,5,1200));

        controle.processarPagamentos(8,6);
    }
}
