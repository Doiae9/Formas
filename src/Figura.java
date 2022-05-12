public abstract class Figura implements AccionesFiguraInterface {
protected String color;
protected boolean relleno;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }
    public abstract double obtenerArea();
    public abstract double obtenerPerimetro();
//Puede tener varios metodos abstractos y metodos con cuerpo
}
