public class Circulo extends Figura{
private double radio;

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double obtenerPerimetro() {
        return Math.PI*radio*2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void rellenar() {

    }

    @Override
    public void duplicar() {
        System.out.println("ha duplicado la figura");
    }

    @Override
    public Figura hacerPequennio() {
        Circulo circuloPeque = new Circulo(this.color, this.relleno, this.radio);
        return circuloPeque;
    }
}
