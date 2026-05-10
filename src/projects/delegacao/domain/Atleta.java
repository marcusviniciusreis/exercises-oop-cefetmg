package projects.delegacao.domain;

public class Atleta extends MembroDelegacao{
    public Atleta(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }

    @Override
    public String exibirDados() {
        return "ATLETA" +
                "\nNome: "+nome+
                "\nGenero: "+genero+
                "\nIdade: "+idade;

    }

    @Override
    public int getIdade() {
        return this.idade;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
