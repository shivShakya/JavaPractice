package Class;

class Point {
    int x;
    int y;

   void setValue(int a , int b){
        this.x = a;
        this.y = b;
    }

    void showValue(){
        System.out.println("X = " + x + "," + "Y = " + y );
    }
}


class Rectangle {
   int l;
   int b;
   static int numberOfObjects = 0;

   


   Rectangle(){
       numberOfObjects++;
   }



   void setLength(int l){
    this.l = l;
   }
   void setWidth(int b){
    this.b = b;
   }

   int getLength(){
    return l;
   }

   int getWidth(){
    return b;
   }

   void area(int l , int b){
        System.out.println(l*b);
   }


}


class MyProgram{
    public static void main(String[] args) {
        //point
        Point p1 = new Point();
        p1.setValue(5, 4);
        p1.showValue();


        //rectangle
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle();
        Rectangle rect4 = new Rectangle();
        Rectangle rect5 = new Rectangle();
        System.out.println(Rectangle.numberOfObjects);

    }
}
