package projects.baralho.domain;

public class Jogador {
    private Carta[] mao; // = j1---> j1.mao= [baralho[0], baralho[2], baralho[4] .. ..
    private int quantidade = 0;

    public Jogador(){
        this.mao = new Carta[5];
    }

    public void receberCarta(Carta carta){
        if (quantidade<5) {
            mao[quantidade] = carta;
            quantidade++;
        }
    }
    public Carta maiorCarta(){
        Carta maior = mao[0];
        for (int i = 0; i < 5; i++) {
            if (mao[i].getValor() > maior.getValor() ){
                maior = mao[i];
            }
        }
        return maior;
    }
}
