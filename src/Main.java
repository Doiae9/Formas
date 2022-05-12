import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //ToDo Clase Padre figura, será abstracta
        //color string, relleno booleano
        //Constructor para los dos parametros
        //getters y setters
        //obtenerArea -> abstracto, que retorne un doble
        //obtenerPerimetro -> abtracto, que retorne doble

        //ToDo clase Circulo
        //radio double
        //constructor, hereda super, e incluye el radio
        //getters y setters
        //implementar obtenerArea
        //implementar obtenerPerimetro

        //ToDo clase Rectangulo
        //ancho double
        //alto double
        //constructor hereda super, ancho y alto
        //getters y setters
        // implementar obtenerAncho
        //implementar obtenerPerimetro

        Circulo circulo = new Circulo("azul", true, 15.7);
        System.out.println(circulo.obtenerArea());
        System.out.println(circulo.obtenerPerimetro());
        circulo.duplicar();
        circulo.rellenar();
        System.out.println(circulo.hacerPequennio().obtenerArea());

        Rectangulo rectangulo = new Rectangulo("rojo", false, 8.50, 6.3);
        System.out.println(rectangulo.obtenerArea());
        System.out.println(rectangulo.obtenerPerimetro());

        Function metodo2 = (elemento) -> elemento;


    ;
        MiInterface metodo = (a,b)-> a+b;
       //MiInterface metodo= (a,b)->{
           // System.out.println("sumando"+a+"+ "+b);
           // return a+b;
       // };
        int resultado = metodo.operacion(5,6);
        System.out.println(resultado);
        metodo = (a,b)-> a*b;
        resultado= metodo.operacion(5,6);
        System.out.println(resultado);

}
}