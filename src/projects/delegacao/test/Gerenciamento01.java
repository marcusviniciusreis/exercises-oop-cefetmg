package projects.delegacao.test;

import projects.delegacao.domain.Atleta;
import projects.delegacao.domain.ComissaoTecnica;
import projects.delegacao.domain.Modalidade;
import projects.delegacao.domain.ProfissionalSaude;

public class Gerenciamento01 {
    public static void main(String[] args) {
        Modalidade futebol  = new Modalidade("Futebol", 22);
        Modalidade volei  = new Modalidade("Volei", 10);
        Modalidade handbol  = new Modalidade("Handbol", 8);

        volei.adicionarMembro(new Atleta("Fabio","Masculino", 20));
        volei.adicionarMembro(new Atleta("Rodrigo","Masculino", 21));
        volei.adicionarMembro(new Atleta("Fabiana","Feminino", 22));

        volei.adicionarMembro(new ComissaoTecnica("Paulo","Masculino", 42, "Tecnico"));
        volei.adicionarMembro(new ComissaoTecnica("Roberto","Masculino", 42, "Auxiliar"));


        volei.adicionarMembro(new ProfissionalSaude("Renato","Masculino", 42, "Medico"));
        volei.adicionarMembro(new ProfissionalSaude("Rodney","Masculino", 42, "Fisioterapeuta"));

        volei.exibirDados();

    }
}
