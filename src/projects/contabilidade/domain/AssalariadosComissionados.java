package projects.contabilidade.domain;

public class AssalariadosComissionados extends Comissionados{
     private double bonus = 0.1;

    public AssalariadosComissionados(String nome, String sobrenome, int documento, double valorVendas) {
        super(nome, sobrenome, documento, valorVendas);
    }

    public double getValorAPagar(int diaPagto, int mesPagto) {
        double comissao = super.getValorAPagar(diaPagto, mesPagto);
        return (SALARIO*bonus) + comissao;
    }
}
