import java.io.*;

class Calc_area{
    int l,b,r,h;
    public Calc_area(int l,int b){
        this.l=l;
        this.b=b;

        System.out.println("Area of Rectangle : "+(float)(l*b));
    }
    public Calc_area(int r){
        this.r=r;

        System.out.println("Area of Circle : "+(float)(3.14 * r * r));
    }
}

class area_shapes{
    public static void main(String[] args) {
        Calc_area c1=new Calc_area(10,20);
        Calc_area c2=new Calc_area(5);
    }
}