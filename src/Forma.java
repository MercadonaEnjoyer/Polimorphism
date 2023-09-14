public class Forma {
    public double area(){
        return 0;
    }
}
class Triangulo extends Forma{
    int altura;
    int base;

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public double area(){

        return base*altura;
    }
}
class Rectangulo extends Forma {
    int l1;
    int l2;

    public Rectangulo(int l1,int l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public double area(){
        return l1*l2;
    }
}
class Cuadrado extends Rectangulo {
    int lado;

    public Cuadrado(int lado) {
        super(lado,lado);
        this.lado = lado;
    }

    public double area(){
        return lado*lado;
    }
}
class Circulo extends Forma{
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public double area(){
        return 3.14*(radio^2);
    }
}