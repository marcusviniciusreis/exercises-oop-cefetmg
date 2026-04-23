package projects.baralho.domain;

import java.security.SecureRandom;

public class Baralho {
    private SecureRandom gerador;
    private String[] naipes={"Copas","Ouros","Paus","Espadas"};
    private Carta[] baralho;
    private int aleatorio = 0;

    public Baralho(){
        this.baralho = new Carta[52];
        this.gerador = new SecureRandom();

            int contador = 0;
            for (int i = 0; i < naipes.length; i++) {
                for (int j = 1; j < 14; j++) {
                    baralho[contador] = new Carta(naipes[i],j);
                    contador++;
                }
            }

    }
    public void embaralharCartas() {
        for (int i = baralho.length - 1; i > 0; i--) {
            int j = gerador.nextInt(i + 1);

            Carta auxiliar = baralho[i];
            baralho[i] = baralho[j];
            baralho[j] = auxiliar;
        }
    }
    public void distribuirCartas(Jogador j1, Jogador j2) {
        for (int i = 0; i < 5; i++) {
            j1.receberCarta(baralho[aleatorio]); // = baralho[2] = (Copas, 9)
            j2.receberCarta(baralho[aleatorio+1]); // baralho[1] =  (Copas, 6)
            aleatorio += 2;
        }
    }
}
