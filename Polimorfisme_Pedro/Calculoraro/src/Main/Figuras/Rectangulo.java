package Main.Figuras;

public class Rectangulo extends Figuras{
    private double area;
    public Rectangulo(int l1, int l2){
        area=l1*l2;
    }
    public double getarea(){
        return area;
    }
}
