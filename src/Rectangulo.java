import java.util.Scanner;

public class Rectangulo extends Figura {
private double ancho;
private double altura;

    public Rectangulo(String color, boolean relleno, double ancho, double altura) {
        super(color, relleno);
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return altura*ancho;
    }

    @Override
    public double obtenerPerimetro() {
        return 2*(altura+ancho);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void rellenar() {

    }

    @Override
    public void duplicar() {

    }

    @Override
    public Figura hacerPequennio() {
        return null;
    }
}
