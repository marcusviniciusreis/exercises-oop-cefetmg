package projects.delegacao.domain;

public class Atleta extends MembroDelegacao{
    public Atleta(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }

    @Override
    public String exibirDados() {
        return "Nome: "+nome+
                "Genero: "+genero+
                "Idade: "+idade;
    }
}
