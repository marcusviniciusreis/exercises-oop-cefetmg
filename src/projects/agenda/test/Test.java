package projects.agenda.test;

import projects.agenda.domain.Agenda;
import projects.agenda.domain.Contato;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda agendaPessoal = new Agenda();

        int continuar = 1;
        while (continuar==1){
            System.out.println("--------AGENDA PESSOAL--------");
            System.out.println("1-Incluir contato\n2-Alterar contato\n3-Pesquisar\n4-Listar contatos\n0-Finalizar\nDigite sua opção:");
            int opcao = input.nextInt();
            input.nextLine();
            if (opcao == 1){
                System.out.println("-------ADICIONANDO CONTATO--------");
                System.out.println("Digite o nome:");
                String nome = input.nextLine();
                System.out.println("Digite o endereco:");
                String endereco = input.nextLine();
                System.out.println("Digite o numero:");
                String numero = input.nextLine();
                System.out.println("Digite o email:");
                String email = input.nextLine();
                agendaPessoal.adicionarContatos(new Contato(nome,endereco,numero,email));
            }else if (opcao == 2){
                System.out.println("Qual o nome do contato deseja fazer a alteração?");
                String nome = input.nextLine();
                agendaPessoal.pesquisarContato(nome);
                System.out.println("--------ATUALIZANDO CONTATO---------");
                System.out.println("1-Alterar nome\n2-Alterar endereco\n3-Alterar telefone\n4-Alterar email\n0-Cancelar\nDigite sua opção:");
                int opcao2 = input.nextInt();
                input.nextLine();
                if (opcao2==1){
                    System.out.println("Qual o novo nome para o contato?");
                    String novonome = input.nextLine();
                    agendaPessoal.alterarNome(nome,novonome);
                }
                else if (opcao2==0){
                    break;
                }else if (opcao2==2){
                    System.out.println("Qual o novo endereco para o contato?");
                    String novoendereco = input.nextLine();
                    agendaPessoal.alterarEndereco(nome,novoendereco);
                } else if (opcao2==3) {
                    System.out.println("Qual o novo telefone para o contato?");
                    String novotelefone = input.nextLine();
                    agendaPessoal.alterarNumero(nome,novotelefone);
                }else if (opcao2==4){
                    System.out.println("Qual o novo email para o contato?");
                    String novoemail = input.nextLine();
                    agendaPessoal.alterarEmail(nome,novoemail);
                }else {
                    System.out.println("Opção invalida!");
                }
            } else if (opcao == 3) {
                System.out.println("Qual o nome do contato que está procurando?");
                agendaPessoal.pesquisarContato(input.nextLine());
            } else if (opcao == 4) {
                agendaPessoal.listarContatos();
            }else if (opcao == 0){
                break;
            }

        }
    }
}
