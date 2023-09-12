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
class Cuadrado extends Forma {
    int lado;

    public Cuadrado(int lado) {

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