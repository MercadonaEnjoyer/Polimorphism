
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!\n");
        Cuadrado f1 = new Cuadrado(10);
        Circulo f2 = new Circulo(5);
        Triangulo f3 = new Triangulo(4,3);
        Rectangulo f4 = new Rectangulo(5,6);
        Forma[] formas = {f1,f2,f3,f4};
        for (Forma f:formas){
            System.out.print(f.area() + "\n");
        }


    }
}