package Class;


class Person{
    public String name;
    public int age;

    
    
    public Person(String name, int age) {
         this.name = name;
         this.age = age;
    }



    public void displayPerson(){
        System.out.println("Details of the person:->");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person{
    public String branch;
    public int Student_id;

    public Student(String name, int age , String branch, int Student_id){
       super(name,age);
    }

    public void displayStudent(){
        System.out.println("Details of Student: ");
        System.out.println("Name: " + super.name);

    }
}

public class superTosub {
    
}
