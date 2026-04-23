package projects.baralho.test;


import projects.baralho.domain.Carta;

public class CartaMain {
    public static void main(String[] args) {
        Carta c1 = new Carta();
        Carta c2 = new Carta();

        c1.setValor(4);
        c2.setValor(3);

        c1.setNaipe("Paus");
        c2.setNaipe("Ouros");

        int resultado = c2.comparaValor(c1);

        if (resultado == 1){
            System.out.println("É maior!");
        }else if (resultado == -1) {
            System.out.println("É menor!");
        }else {
            System.out.println("É igual!");
        }

        c2.comparaNaipe(c1);

    }
}
