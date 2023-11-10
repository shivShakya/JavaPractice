package Class;

class A {
    protected static int i;
    static int j;
    //constructor
    //getter
    //setter

    static void showij(){
        System.out.println("i is " + i + " and j is" + j);
    }
}

class B extends A{
    static int k;

    static void showk(){
        System.out.println("k is" + k);
    }

    static void addIjk(){
        System.out.println(" after adding : " +  (i + j + k));
    }
}


class Cube{
   protected double height,width,depth;

   Cube(double height, double width, double depth){
        System.out.println("The constructor for cube");

        this.height = height;
        this.width = width;
        this.depth = depth;
   }

   double Volume(){
        return height*width*depth;
   }
}

class CubeWeight extends Cube{
    protected double weight;
    CubeWeight(double height, double width, double depth , double weight) {
        super(height, width, depth);
        this.weight = weight;
    }
   
      
}





public class InheritanceDemo{
    public static void main(String args[]){
        A objA = new A();
        objA.i = 10;
        objA.j = 20;

        B objB = new B();
        objB.k = 5;

        
        B.showij();
        B.showk();
        B.addIjk();

    }
}