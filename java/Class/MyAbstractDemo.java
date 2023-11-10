package Class;

abstract class Car{
    public abstract double getAverage();
}

class Swift extends Car{
    public double getAverage(){
        return 22.5;
    }
}

public class MyAbstractDemo{
    public static void main(String[] args) {
        Swift s = new Swift();
        System.out.println(s.getAverage());
    }
}