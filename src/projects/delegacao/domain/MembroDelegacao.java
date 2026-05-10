package projects.delegacao.domain;

public abstract class MembroDelegacao {
    protected String nome;
    protected String genero;
    protected int idade;

    public MembroDelegacao(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public abstract String exibirDados();

}
