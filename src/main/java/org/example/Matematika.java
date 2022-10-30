package org.example;

public class Matematika {
    public static double sinus(double x){
        x = x * Math.PI/180;
        double sinx = 0;
        int stepen = 1;
        int predznak = 1;
        for(int i = 1; i < 10; i++, stepen+=2, predznak*=-1) {
            sinx += predznak * Math.pow(x,stepen) / faktorijel(stepen);
        }
        return sinx;
    }
    public static int faktorijel(int x) {
        int f=1;
        for(int i=x; i >= 2; i--) {
            f*=i;
        }
        return f;
    }
}
