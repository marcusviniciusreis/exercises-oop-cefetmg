package projects.contabilidade.contas;

public class Titulo extends Contas{

    public Titulo(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    @Override
    public double getValorAPagar(int diaPagamento, int mesPagamento) {
        if (((diaPagamento > dia) && (mesPagamento > mes) || ((diaPagamento <= dia) && (mesPagamento > mes)))){
            return valor + (valor*0.1);
        }else
            return valor;
    }
}
