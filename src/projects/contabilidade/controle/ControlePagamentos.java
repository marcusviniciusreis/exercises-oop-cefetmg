package projects.contabilidade.controle;

import projects.contabilidade.contas.Contas;
import projects.contabilidade.empregados.Funcionario;
import projects.contabilidade.empregados.Passivo;

import java.util.ArrayList;

public class ControlePagamentos {
    private ArrayList<Passivo> pagamentos;

    public ControlePagamentos(){
        pagamentos = new ArrayList<>();
    }
    public void adicionarPagamento(Passivo p){
        pagamentos.add(p);
    }

    public void processarPagamentos(int dia, int mes){
        double totalFuncionarios = 0;
        double totalContas = 0;

        for (Passivo p : pagamentos){

            double valor = p.getValorAPagar(dia, mes);

            if(p instanceof Funcionario){
                totalFuncionarios += valor;
            }
            if(p instanceof Contas){
                totalContas += valor;
            }
        }
        System.out.println("-=-=-=-=-=-=-RESUMO DE PAGAMENTOS=-=-=-=-=-=-=-");
        System.out.println("Total gasto com funcionarios: "+totalFuncionarios);
        System.out.println("Total gasto com contas: "+totalContas);
        System.out.println("Total gasto geral: "+(totalContas + totalFuncionarios));
    }

}
