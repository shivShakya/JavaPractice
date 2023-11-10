class pattern {
    public static void main(String[] args) {
        for( int i =0 ; i < 5 ; i++){
            for (int j =0 ; j < 5 ; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}

class pattern2 {
    public static void main(String[] args) {
        for( int i = 1 ; i < 6 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                 if (j < i ){
                    System.out.print(" * ");
                 }
            }
            System.out.print("\n");
        }
    }
}

class pattern3 {
    public static void main(String[] args) {
        int val = 5;
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < val ; j++){
                     System.out.print(" * ");           
            } 
            val--;
            System.out.println('\n');
        }
    }
}

class pattern4 {
    public static void main(String[] args) {
        int val = 5;
        for (int i =1 ; i <= val ; i++){
            for (int j = 1 ; j <= val ; j++){
                if (j <= (val - i)){
                     System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println("\n");
        }
    }
}

class pattern5 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                   if ( (j >= (float)(0+(i-2))/2) && j <= (float)((j+1) + 4)/2) {
                           System.out.print(" * ");
                   }
            }
            System.out.println("\n");
        }
    }
}