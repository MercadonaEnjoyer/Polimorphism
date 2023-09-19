package Main.Figuras;

public class cuadrado extends Rectangulo{
    private double area;
    public cuadrado (int l1){
        super(l1,l1);
        area=l1*l1;
    }
    public double getarea(){
        return area;
    }
}
