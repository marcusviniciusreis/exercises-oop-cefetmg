package projects.contabilidade.empregados;

public class Terceirizado extends Funcionario{
    private double horasTrabalhadas;

    public Terceirizado(String nome, String sobrenome, int documento, double horasTrabalhadas) {
        super(nome, sobrenome, documento);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getValorAPagar(int diaPagamento, int mesPagamento) {
        return horasTrabalhadas*VALORHORA;
    }
}
