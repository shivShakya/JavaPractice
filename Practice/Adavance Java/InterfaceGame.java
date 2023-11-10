@FunctionalInterface
interface A{
    int add(int x , int y);
}

class B implements A {
       public int add(int x , int y ){
            return x + y;
       }
}

public class InterfaceGame {

    public static void main(String[] args) {
         A obj = (x , y) -> (x + y);
         System.out.println(obj.add(5,7));
    }   
}
