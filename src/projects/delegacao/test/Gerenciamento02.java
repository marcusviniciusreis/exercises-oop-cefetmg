package projects.delegacao.test;

import projects.delegacao.domain.Atleta;
import projects.delegacao.domain.ComissaoTecnica;
import projects.delegacao.domain.Modalidade;
import projects.delegacao.domain.ProfissionalSaude;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciamento02 {
    public static void main(String[] args) {
        Modalidade futebol  = new Modalidade("Futebol", 20);
        Modalidade volei  = new Modalidade("Volei", 1);
        Modalidade handbol  = new Modalidade("Handbol", 20);

        ArrayList<Modalidade> modalidades = new ArrayList<>();

        modalidades.add(futebol);
        modalidades.add(volei);
        modalidades.add(handbol);

        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        int opcao = 0;

        while(opcao!=5){
            System.out.println("-----SISTEMA DE GERENCIAMENTO-----");
            System.out.println("1-Inscrição em nova modalidade");
            System.out.println("2-Adicionar membro a modalidade");
            System.out.println("3-Remover membro de modalidade");
            System.out.println("4-Exibir dados por modalidade");
            System.out.println("5-Sair");
            System.out.println("Escolha a opção: ");

            opcao = inputInt.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome da modalidade: ");
                    String nome = inputString.nextLine();
                    for(Modalidade m : modalidades) {
                        if (m.getDescricao().equals(nome)) {
                            System.out.println("Modalidade existente!");
                            break;
                        }else {
                            System.out.println("Digite o limite de participantes da modalidade: ");
                            int limite = inputInt.nextInt();
                            modalidades.add(new Modalidade(nome,limite));
                            System.out.println("Modalidade: "+nome+"\nLimite: "+limite+"\nAdicionados com sucesso!");
                            break;
                        }
                    }
                    break;


                case 2:
                    System.out.println("Qual modalidade gostaria de adicionar o membro? ");
                    String desc = inputString.nextLine();
                    boolean test = false;
                    for(Modalidade m: modalidades){
                        if(m.getDescricao().equals(desc)){
                            int opcao2 = 0;
                            test = true;
                            System.out.println("-----TIPOS DE MEMBRO-----");
                            System.out.println("1-Atleta");
                            System.out.println("2-Comissao Tecnica");
                            System.out.println("3-Profissional Saude");
                            opcao2 = inputInt.nextInt();
                            switch (opcao2){
                                case 1:
                                    System.out.println("Digite o nome: ");
                                    String nomeatleta = inputString.nextLine();
                                    System.out.println("Digite o genero: ");
                                    String generoatleta = inputString.nextLine();
                                    System.out.println("Digite a idade: ");
                                    int idadeatleta = inputInt.nextInt();
                                    m.adicionarMembro(new Atleta(nomeatleta, generoatleta, idadeatleta));
                                    break;
                                case 2:
                                    System.out.println("Digite o nome: ");
                                    String nomecomissao = inputString.nextLine();
                                    System.out.println("Digite o genero: ");
                                    String generocomissao = inputString.nextLine();
                                    System.out.println("Digite a idade: ");
                                    int idadecomissao = inputInt.nextInt();
                                    System.out.println("Digite a atividade");
                                    String atividadecomissao = inputString.nextLine();
                                    m.adicionarMembro(new ComissaoTecnica(nomecomissao, generocomissao, idadecomissao, atividadecomissao));
                                    break;
                                case 3:
                                    System.out.println("Digite o nome: ");
                                    String nomesaude = inputString.nextLine();
                                    System.out.println("Digite o genero: ");
                                    String generosaude = inputString.nextLine();
                                    System.out.println("Digite a idade: ");
                                    int idadesaude = inputInt.nextInt();
                                    System.out.println("Digite a atividade");
                                    String especialidade = inputString.nextLine();
                                    m.adicionarMembro(new ProfissionalSaude(nomesaude, generosaude, idadesaude, especialidade));
                                    break;
                            }
                            }

                        }break;

                case 3:
                    boolean testremove = false;
                    System.out.println("Qual modalidade gostaria de adicionar o membro? ");
                    String descremove = inputString.nextLine();
                    for(Modalidade m: modalidades){
                        if(m.getDescricao().equals(descremove)) {
                            testremove = true;
                            System.out.println("Digite o nome do membro a ser removido:");
                            String nomeremove = inputString.nextLine();
                            System.out.println("Digite a idade do membro a ser removido: ");
                            int idaderemove = inputInt.nextInt();
                            m.removerMembro(nomeremove,idaderemove);
                            break;
                        }
                    }break;
                case 4:
                    boolean testexibe = false;
                    System.out.println("Qual modalidade gostaria de exibir os dados? ");
                    String descexibe = inputString.nextLine();
                    for(Modalidade m: modalidades){
                        if(m.getDescricao().equals(descexibe)){
                            m.exibirDados();
                            break;
                        }
                    }break;
                case 5:
                    System.out.println("Opcao invalida!");
                    return;
            }
        }
    }
}
