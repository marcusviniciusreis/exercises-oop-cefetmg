package projects.contabilidade.empregados;

public class Comissionados extends Funcionario{
    private double valorVendas;

    public Comissionados(String nome, String sobrenome, int documento, double valorVendas) {
        super(nome, sobrenome, documento);
        this.valorVendas = valorVendas;
    }

    @Override
    public double getValorAPagar(int diaPagamento, int mesPagamento) {
        return valorVendas*0.6;
    }
}
