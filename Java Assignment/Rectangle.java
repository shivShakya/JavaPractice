
// Rectangle class with method

class Rectangle{
    float height;
    float width;

    public Rectangle(float Height, float Width){
         height = Height;
         width = Width;
    }

    public void calArea(){
         System.out.println("Area = "+ (height*width));
    }
}


// Main function

class MyProgram{
    public static void main(String[] args) {
          Rectangle R1 = new Rectangle((float) 25.2, (float) 32.4);
          R1.calArea();
    }
}