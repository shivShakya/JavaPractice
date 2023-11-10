public class Fraction {
     private int numerator;
     private int denominator;

     public Fraction(int numerator , int denominator){
        this.denominator = denominator;
        this.numerator = numerator;
     }

    //getter 
     int getNumerator(){
        return numerator;
     }
     //getter
     int getDenominator(){
        return denominator;
     }
 

     // for addition
     Fraction add(Fraction f){
       int numerator = this.numerator* f.getDenominator() + this.denominator* f.getNumerator();
       int denominator = this .denominator* f.getDenominator();

       return new Fraction(numerator,denominator);   
     }

    //for subtraction

    Fraction sub(Fraction f){
        int numerator = this.numerator* f.getDenominator() - this.denominator* f.getNumerator();
        int denominator = this .denominator* f.getDenominator();
 
        return new Fraction(numerator,denominator);   
      }

    // for multiplication
    Fraction mul(Fraction f){
        int numerator = this.numerator* f.getNumerator();
        int denominator = this.denominator*f.getDenominator();
 
        return new Fraction(numerator,denominator);   
      }

    //for division
    Fraction div(Fraction f){
        int numerator = this.numerator* f.getDenominator();
        int denominator = this.denominator*f.getNumerator();
 
        return new Fraction(numerator,denominator);   
      }


     void print(){
        System.out.println(numerator+ "/" + denominator);
     }

}

class addFractions{
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5, 4);
        Fraction f2 = new Fraction(7, 3);


        Fraction f3 =  f1.add(f2);
        f3.print();

        Fraction f4 = f1.sub(f2);
        f4.print();

        Fraction f5 = f1.mul(f2);
        f5.print();

        Fraction f6 = f1.div(f2);
        f6.print();
    }
}
