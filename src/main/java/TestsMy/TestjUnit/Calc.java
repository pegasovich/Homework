package TestsMy.TestjUnit;

public class Calc {

    double mem;

    public double add (double a, double b){
        return a+b;
    }

    public double sub (double a, double b){
        return a-b;
    }


    public void memplus (double a){
        mem= mem +a;
    }

    public  void memminus(double a){
        mem=  mem - a;
    }

    public double getMem(){
        return mem;
    }


    public void clearMem(){
        mem = 0;
    }
}

