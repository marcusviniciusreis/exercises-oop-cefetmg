package projects.contabilidade.empregados;

public class Assalariado extends Funcionario{
    private double horasExtras;

    public Assalariado(String nome, String sobrenome, int documento, double horasExtras) {
        super(nome, sobrenome, documento);
        this.horasExtras = horasExtras;
    }

    @Override
    public double getValorAPagar(int diaPagamento, int mesPagamento) {
        return SALARIO + (horasExtras*VALORHORA);
    }
}
