package uaslp.objetos.figuras;
import java.lang.Math;

public class PoligonoRegular extends Figura {
    private double lado;
    private int numeroDeLados;

    PoligonoRegular(int numeroDeLados,double lado){
        this.lado = lado;
        this.numeroDeLados = numeroDeLados;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return this.lado;
    }

    PoligonoRegular (int numeroDeLados){
        if(numeroDeLados <= 5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }
        this.numeroDeLados = numeroDeLados;
    }

    double getArea(){
        double area;
        double apotema;
        apotema = lado/(2*Math.tan( Math.toRadians(180/numeroDeLados)));
        area = lado*numeroDeLados*apotema/2;
        return area;
    }
    @Override
    public String getName(){
        return "Poligono Regular";
    }
}
