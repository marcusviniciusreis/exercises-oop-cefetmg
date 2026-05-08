package projects.contabilidade.empregados;

public abstract class Funcionario implements Passivo{
    protected String nome;
    protected String sobrenome;
    protected int documento;

    public Funcionario(String nome, String sobrenome, int documento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
    }

}
