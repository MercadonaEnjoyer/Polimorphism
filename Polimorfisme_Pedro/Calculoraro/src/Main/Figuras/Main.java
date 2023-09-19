package Main.Figuras;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        Figuras[] v= new Figuras[4];
        double[] areas= new double[v.length];

        v[3]= new Rectangulo(5,3);
        v[2]= new Circulo(5);
        v[1]= new cuadrado(5);
        v[0]= new Circulo(120);

        double res = suma(v);
        ordenarareas(v,areas);

        System.out.println("suma:"+res);
        //Arrays.sort(v);

        int i;
        for (i=0;i<v.length;i++){
            System.out.println(areas[i]);
        }


    }
    public static double suma(Figuras[] v){
        double res;
        int i;
        res=0;
        for (i=0;i<v.length;i++){
            res=v[i].getarea()+res;
        }
        return res;
    }
    public static double[] ordenarareas(Figuras[] v, double[] areaordenada){
        int i;
        for (i=0;i<v.length;i++){
            areaordenada[i]=v[i].getarea();
        }
        sort(areaordenada);
        return areaordenada;
    }
}