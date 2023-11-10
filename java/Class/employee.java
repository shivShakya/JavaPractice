package Class;

class Emp{
   private int id;
   private String name;
   private int salary;
    
   //constructor
   Emp(int id ,String name,int salary){
       this.id = id;
       this.name = name;
       this.salary = salary;
   }


   void DisplayEmp(){
        System.out.println("id: "+ id);
        System.out.println("name: "+ name);
        System.out.println("salary: "+ salary);
   }
}

class Manager extends Emp{
     int bonus;

     Manager(int id ,String name , int salary, int bonus){
           super(id,name,salary);
           this.bonus = bonus;
     }

    void DisplayManeger(){
        super.DisplayEmp();
        System.out.println("bonus: "+ bonus);
    }
}


public class employee {

    public static void main(String[] args) {
        Emp emp = new Emp(123, "Shivam", 80000);
        emp.DisplayEmp();

        System.out.println("Manegers Details");
        Manager manager = new Manager(100, "Shivam", 2000000, 30000);
        manager.DisplayManeger();
    }
}
