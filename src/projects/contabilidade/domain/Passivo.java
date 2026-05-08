package projects.contabilidade.domain;

public interface Passivo {
    double SALARIO = 1621;
    double VALORHORA = 65;

    double getValorAPagar(int diaPagamento, int mesPagamento);
}
