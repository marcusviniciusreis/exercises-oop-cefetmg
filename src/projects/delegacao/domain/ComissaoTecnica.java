package projects.delegacao.domain;

public class ComissaoTecnica extends MembroDelegacao{
    private String atividade;


    public ComissaoTecnica(String nome, String genero, int idade, String atividade) {
        super(nome, genero, idade);
        this.atividade = atividade;
    }

    @Override
    public String exibirDados() {
        return "Nome: "+nome+
                "\nGenero: "+genero+
                "\nIdade: "+idade+
                "\nAtividade: "+atividade;
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
