public class Circulo extends Figura{
private double radio;

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return 3.1416*Math.pow(getRadio(),2);
    }

    @Override
    public double obtenerPerimetro() {
        return 2*3.1416*getRadio();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
