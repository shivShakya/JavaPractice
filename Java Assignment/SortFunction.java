import java.util.*;

class Fraction{
        private int num;
        private int den;
        public static int numOfObject = 0;

      public Fraction()
        {
          this.num=0;
          this.den=1;
          numOfObject++;
        }
     public Fraction(int num,int den)
        {
          this.num=num;
          this.den=den;
          numOfObject++;
        }
       public double showFraction()
        {
         return (this.num/this.den);
        }
        public void display()
        {
        System.out.println(this.num+"/"+this.den);
        }
public static void sortFraction(Fraction s[],int n)
                {
                                for(int i=n-1;i>=0;i--)
                                {
                                                for(int j=0;j<i;j++)
                                                {
                                                                if(s[j].showFraction()>s[j+1].showFraction())
                                                                {
                                                                                Fraction t=s[j];
                                                                                s[j]=s[j+1];
                                                                                s[j+1]=t;
                                                                }
                                                }
                                }
                                for(int i=0;i<n;i++)
                                                s[i].display();
 
                }
}
class SortFraction
{
public static void main(String[] args)
        {       Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of Fractions:");
                int n = sc.nextInt();
                Fraction  obj[]  = new Fraction[n];
                for(int i=0; i<n;i++)
                {
                  System.out.print("Enter the numerator:");
                  int n1 = sc.nextInt();
                  System.out.print("Enter the denominator:");
                  int d = sc.nextInt();
                  obj[i] = new Fraction(n1,d);
        
                }
              System.out.println("Sorted Fraction as follows :");
              Fraction.sortFraction(obj,Fraction.numOfObject);
        }
}