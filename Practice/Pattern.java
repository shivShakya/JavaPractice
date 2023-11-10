
/*
public class Pattern{
       public static void main(String[] args){
                for(int i = 0 ; i < 5 ; i++){
                        for(int j = 0 ;  j < 5 - i ; j++){
                                   System.out.print("*");
                        }
                       System.out.println();
                }

       }
}
*/
/*
public class Pattern{
     public static void main(String[] args){
           for(int i = 0 ; i < 5 ; i++){
                 for(int j = 0 ; j < 5 -i; j++){
                        if(i == 0){
                               System.out.print("*");
                        } 
                        else{
                        System.out.print(" ");
                        }
                 }
                 if(i == 4){
                     System.out.println("*");
                     for(int k = 0 ; k < 6 ; k++){
                             System.out.print("*");
                     }
                      System.out.println();
                 }
                 System.out.println("*");
           }
     }
}
*/
/*
public class Pattern{
        public static void main(String[] args){
               for(int i = 0 ; i < 5 ; i++){
                     for(int j = 0 ; j < i ; j++){
                             System.out.print(" ");
                     }
                     for(int j = i ; j < 5 ; j++){
                            System.out.print("*");
                     }
                     System.out.println();
                   
               }
        }
}
*/
/*
public class Pattern{
        public static void main(String[] args){
                for(int i = 0 ; i < 5 ; i++){
                        for(int j = 0 ; j < 5-i-1; j++){
                               System.out.print(" ");
                        }

                        for(int j = 5-i-1 ; j < 5 ; j++){
                               System.out.print("*");
                        }

                        System.out.println();
                }
        }
}
*/
/*
public class Pattern{
        public static void main(String[] args){
                for(int i = 0 ; i < 5 ; i++){
                       for(int j = 0 ; j < 5-i; j++){
                             System.out.print("*");
                       }
                      System.out.println();
                }
        }
}
*/
/*
public class Pattern{
         public static void main(String[] args){
                for(int i = 1 ; i <= 5 ; i++){
                        for(int j = 1; j <= 5 - i ; j++){
                               System.out.print(" ");
                        }

                        for(int k = 1 ; k <= i ; k++){
                               System.out.print("" + k + "");
                        }
                        for (int l = i - 1; l >= 1; l--) {
                                 System.out.print(l + "");
                        }

                        System.out.println();
                }
         }
}
*/

public class Pattern {
    public static void main(String[] args) {
        int rows = 9;
        int spaces = rows / 2;
        int stars = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            System.out.println();

            if (i <= rows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }
}
