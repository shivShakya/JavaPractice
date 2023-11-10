class Complex{
        private int x; //real
        private int y; //imaginary
      public Complex(int x, int y)
          { this.x = x;
            this.y = y;
          }
      public void showComplex()
        {
        System.out.println(this.x+"+"+this.y+"i");
        }
      public void add(Complex f)
     {    int num1 = this.x+f.x;
          int num2 = this.y+f.y;
          System.out.println("Addition="+ num1+"+"+num2+"i");
      }
      public void Sub(Complex f)
     {    int num1 = this.x-f.x;
          int num2 = this.y-f.y;
          System.out.println("Subtraction="+ num1+"+"+num2+"i");
      }
      public void Mul(Complex f)
     {    int num1 = this.x*f.x;
          int num2 = this.y*f.y;
          int num3 = this.y*f.x;
          int num4 = this.x*f.y;
          int t= num1-num2;
          System.out.println("Multiplication="+ t + "+" + "i"+num3+num4);
      }
     public void Div(Complex f)
      {    int num1 = this.x*f.x;
          int num2 = this.y*f.y;
          int num3 = this.y*f.x;
          int num4 = this.x*f.y;
          int t= num1-num2;
           int num5=f.x*f.x;
           int num6=f.y*f.y;
           int num7=num5+num6;
           System.out.println("Division="+ t+"+"+"i"+num3+num4+"/"+num7);
       }
}
class ComplexOperation{
public static void main(String[] args)
        {
          Complex f1 = new Complex(1,2);
          Complex f2 = new Complex(2,3);
          f1.add(f2);
          f1.Mul(f2);
          f1.Sub(f2);
          f1.Div(f2);
        }
}