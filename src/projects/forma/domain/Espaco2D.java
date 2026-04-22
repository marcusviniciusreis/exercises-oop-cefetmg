package projects.forma.domain;

import java.util.ArrayList;

public class Espaco2D {
    private ArrayList<Forma> formas;

    public Espaco2D(ArrayList<Forma> formas) {
        this.formas = formas;
    }

    public boolean adicionarForma(Forma forma){
        return formas.add(forma);
    }

    public double calcularAreaTotal(){
        double total = 0;

        for(Forma aux: formas){
            total += aux.calcularArea();
        }
        return total;
    }

    public double calcular2p(){
        double total = 0;

        for(Forma aux: formas){
            total += aux.calcularPerimetro();
        }
        return total;
    }

    public String mostrarTipoTriangulo(){
        String tipo = "";

            for(Forma aux: formas){
                if(aux instanceof Triangulo){
                    tipo += ((Triangulo) aux).tipoTriangulo();
                }
            }
            return tipo;
    }
}
