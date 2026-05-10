package projects.delegacao.domain;

public class ProfissionalSaude extends MembroDelegacao{
    private String especialidade;

    public ProfissionalSaude(String nome, String genero, int idade, String especialidade) {
        super(nome, genero, idade);
        this.especialidade = especialidade;
    }

    @Override
    public String exibirDados() {
        return "Nome: "+nome+
                "Genero: "+genero+
                "idade: "+idade+
                "Atividade: "+especialidade;
    }
}
