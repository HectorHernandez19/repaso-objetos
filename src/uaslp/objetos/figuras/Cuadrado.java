package uaslp.objetos.figuras;

public class Cuadrado {
    private double lado;

    Cuadrado (){
    }

    Cuadrado (double lado){
        setLado(lado);
    }

    double getArea(){
        return lado*lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
