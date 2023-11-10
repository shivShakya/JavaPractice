public class Insertion{

      
    public static void InsertionSort( int[] arr ,int n ){
            
           for(int i = 0 ; i < n  ; i++){

                  int curr = arr[i];
                  int j = i - 1;

                  while(j >= 0 && arr[j] > curr){
                        
                    arr[j+1] = arr[j];
                    j--;
                }

                arr[j+1] = curr;
           }     
    }

      
      
    public static void main(String [] args){

          int[] arr = {4,5,1,9,7};
          InsertionSort(arr , 5);
         for(int i = 0 ; i < 5 ; i++){
                  System.out.print(arr[i]);
         }
    }
}