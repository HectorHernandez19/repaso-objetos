package uaslp.objetos.figuras;

public class Cuadrado extends Figura {
    private double lado;

    Cuadrado (){}

    Cuadrado (double lado){
        setLado(lado);
    }

    double getArea(){
        if(lado <= 0 ) {
            throw new LadoNoProvistoException();
        }
        return lado * lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String getName(){
        return "Cuadrado";
    }
}
