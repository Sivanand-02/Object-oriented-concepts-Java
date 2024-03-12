import java.io.*;

class Time{
    int h,m;
    
    public Time(int m,int h){
        this.m=m;
        this.h=h;
    }

    Time sum(Time t){
        t.m+=this.m;
        t.h+=this.h;

        while(t.m >= 60){
            t.h++;
            t.m-=60;
        }
        while(t.h >= 24)
        {
            t.h-=24;
        }
        return t;
    }

}

public class time_sum {
    public static void main(String[] args) {
        Time t1,t2,t3;
        t1 = new Time(59,11);
        t2 = new Time(59,24);
        t3 = t1.sum(t2);
        System.out.println(t3.h+":"+t3.m);
    }
}
