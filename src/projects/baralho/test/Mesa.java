package projects.baralho.test;


import projects.baralho.domain.Baralho;
import projects.baralho.domain.Carta;
import projects.baralho.domain.Jogador;

public class Mesa {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Carta maior1 = new Carta();
        Carta maior2 = new Carta();
        Baralho baralho = new Baralho();

        baralho.embaralharCartas();
        baralho.distribuirCartas(j1,j2);

        maior1 = j1.maiorCarta();
        maior2 = j2.maiorCarta();

        System.out.println("A maior carta do jogador 1 é "+ maior1.getValor()+" de "+maior1.getNaipe());
        System.out.println("A maior carta do jogador 2 é "+ maior2.getValor()+" de "+maior2.getNaipe());

        if(maior1.getValor() > maior2.getValor()){
            System.out.println("Jogador 1 tem a carta maior que o Jogador 2!");
            System.out.println("Jogador 1 venceu!");
        } else if (maior1.getValor() < maior2.getValor()) {
            System.out.println("Jogador 2 tem a carta maior que o Jogador 2!");
            System.out.println("Jogador 2 venceu!");
        }else{
            if ((maior1.getNaipe().equals("Ouros")) && (!maior2.getNaipe().equals("Ouros"))){
                System.out.println("O valor das cartas sao iguais mas o Jogador 1 possui naipe de ouros");
                System.out.println("Jogador 1 venceu!");
            } else if (((!maior1.getNaipe().equals("Ouros")) && (maior2.getNaipe().equals("Ouros")))) {
                System.out.println("O valor das cartas sao iguais mas o Jogador 2 possui naipe de ouros");
                System.out.println("Jogador 2 venceu!");
            }else {
                System.out.println("Houve empate pelo fato de terem mesmo valor e naipe");
            }
        }
    }
}
