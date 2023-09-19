package Main.Figuras;

public class Circulo extends Figuras{
    private double area;
    public Circulo(int l1){
        area=l1*Math.PI*Math.PI;
    }
    public double getarea(){
        return area;
    }
}
