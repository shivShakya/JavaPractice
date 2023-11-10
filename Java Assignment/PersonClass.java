class MyProg{
   public static void main(String[] args) {
        Person p1 = new Person("Shivam Shakya", "male", 23, "student");
        p1.displayName();
    }
}



class Person {
    String Name;
    String Gender;
    int Age;
    String Profession;


    public Person(String name , String gender, int age , String prof){
        Name = name;
        Gender = gender;
        Age = age;
        Profession = prof;
    }




    public void displayName(){
        System.out.println("name "+ Name);
    }
    public void displayGender(){
        System.out.println("Gender "+Gender);
    }
    public void displayAge(){
        System.out.println("Age "+Age);
    }

    public void displayProf(){
        System.out.println("Gender "+Profession);
    }

}