import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!\n");
        List<Forma> f = new ArrayList<>();
        Cuadrado f1 = new Cuadrado(10);
        f.add(f1);
        Circulo f2 = new Circulo(5);
        f.add(f2);
        Triangulo f3 = new Triangulo(4,3);
        f.add(f3);
        Rectangulo f4 = new Rectangulo(5,6);
        f.add(f4);
        for (Forma forma:f){
            System.out.print(forma.area() + "\n");
        }
    }
}