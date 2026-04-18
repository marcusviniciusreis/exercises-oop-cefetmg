package projects.forma.domain;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(){
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D p){
        this.x = p.getX();
        this.y = p.getY();
    }

    public double calcularDistancia(Ponto2D p){
        double distancia;

        distancia = Math.sqrt((Math.pow((this.x - p.x),2)+Math.pow((this.y - p.y),2)));
        return distancia;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
