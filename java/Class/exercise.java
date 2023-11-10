package Class;


class Shape{
    protected String Name;
    protected String Color;
    
    Shape(String Name , String Color){
        this.Name = Name;
        this.Color = Color;
    }
}

class Circle extends Shape{
    double radius;
    double PI;

    Circle(String Name, String Color , double radius, double PI){
        super(Name,Color);
        this.radius = radius;
        this.PI = PI;

    }

    void calCircleArea(){
        System.out.println("The area of the circle" + (radius*radius*PI));   
    }
}

class Rectangle extends Shape{
    double height;
    double width;

    Rectangle(String Name, String Color , double height, double width){
        super(Name,Color);
        this.height = height;
        this.width = width;

    }

    void calRectArea(){
        System.out.println("The area of the Rectangle" + (height*width));   
    }
}

class Triangle extends Shape{
    double length;
    double width;

    Triangle(String Name,String Color, double length, double width){
        super(Name,Color);
        this.length = length;
        this.width = width;
    }

    void calTriArea(){
        System.out.println("The Area of the Triangle"+ ((1/2)*length*width));
    }
}


