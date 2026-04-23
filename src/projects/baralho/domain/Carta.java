package projects.baralho.domain;

public class Carta {
    private String naipe;
    private int valor;

    public Carta(String naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Carta(){
        this.naipe = "";
        this.valor = 0;
    }

    public Carta(Carta carta){
        this.naipe = carta.naipe;
        this.valor = carta.valor;
    }

    public int comparaValor(Carta auxiliar){
        if(this.valor > auxiliar.valor){
            return 1;
        }else if (this.valor < auxiliar.valor) {
            return -1;
        }else{
            return 0;
        }
    }

    public void comparaNaipe(Carta auxiliar){
        if(this.naipe.equals(auxiliar.naipe)){
            System.out.println("Ambos possuem o mesmo naipe");
        }else {
            System.out.println("Naipes diferentes!");
        }
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public int getValor() {
        return valor;
    }
}

