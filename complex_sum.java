import java.io.*;

class Complex{
    int i,r;
    
    public Complex(int i,int r){
        this.i=i;
        this.r=r;
    }

    Complex sum(Complex c){
        c.i+=this.i;
        c.r+=this.r;
        return c;
    }

}

public class complex_sum {
    public static void main(String[] args) {
        Complex c1,c2,c3;
        c1 = new Complex(5,10);
        c2 = new Complex(3,15);
        c3 = c1.sum(c2);
        System.out.println("Sum of c1 and c2 : "+c3.r+" + "+c3.i+"i");
    }
}
