package projects.contabilidade.contas;

import projects.contabilidade.empregados.Passivo;

public abstract class Contas implements Passivo {
    protected int dia;
    protected int mes;
    protected double valor;

    public Contas(int dia, int mes, double valor) {
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }

}
