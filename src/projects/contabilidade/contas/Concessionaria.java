package projects.contabilidade.contas;

public class Concessionaria extends Contas{

    public Concessionaria(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    @Override
    public double getValorAPagar(int diaPagamento, int mesPagamento) {
        return valor;
    }
}
