package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    Triangulo(){}

    Triangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    double getArea(){
        if(base <= 0){
            throw new BaseNoProvistaException();
        }else if (altura <= 0){
            throw new AlturaNoProvistaException();
        }
        double area;
        area = base*altura/2;
        return area;
    }

    public String getDescription(){
        return "Cualquier triangulo";
    }

    @Override
    public String getName(){
        return "Triangulo";
    }
}
