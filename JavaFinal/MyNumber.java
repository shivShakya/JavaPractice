public class MyNumber{
     
     private int x ;

     public MyNumber(){
          this.x = 0 ;
     }
    
     public MyNumber(int x){
         this.x = x ;
     }

     public void isNegative(){
                if ( x < 0){
                      System.out.println("The number is negative");
                }else{
                    System.out.println("It is not negative");
                }
     }

     public void isPositive(){
            if ( x > 0){
                   System.out.println("The number is positive");
            }else{
                    System.out.println("It is not positive");
                }

     }

     public void isZero(){
           if ( x == 0 ){
                 System.out.println("The number is zero");
           }else{
                    System.out.println("It is not zero");
                }
         
     }

     public void isOdd(){
          if ( x%2 != 0){
                System.out.println("The number is odd"); 
          }else{
                    System.out.println("It is not odd");
                }
         
     }

     public void isEven(){
          if (x%2 == 0 ){
               System.out.println("the number is even");
          }else{
                    System.out.println("It is not even");
                }
     }


     public static void main(String[] args){
        try {
             int value = Integer.parseInt(args[0]);
              MyNumber number = new MyNumber(value);
              number.isEven();
              number.isOdd();
              number.isZero();
              number.isPositive();
              number.isNegative();
        }
        catch(Exception e){
               System.out.println("Please add value array is empty");
               e.printStackTrace();
        }
     }

}