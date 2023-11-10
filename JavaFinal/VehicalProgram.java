/*
Write a Java program to create a super class Vehicle having members Company and price
Derive
2
different classes LightMotorVehicle
(members
mileage)
and
HeavyMotorVehicle (members - capacity-in-tons). Accept the information for n vehicles
and display the information in appropriate form. While taking data, ask the user about the
type of vehicle first.
*/

import java.util.Scanner;

class Vehicle{
       
       protected String Company;
       protected double Price ;

       public Vehicle(String Company , double price){
            this.Company = Company ;
            this.Price = price;
       }
}

class LightMotorVehicle extends Vehicle{
       private double mileage;

       public LightMotorVehicle(String Company , double price , double mileage){
            super(Company , price);
            this.mileage = mileage;
       }

       public void displayInfo(){
           System.out.println( "Company : " + Company);
           System.out.println( "Price : " + Price);
           System.out.println( "Mileage : " + mileage);
           System.out.println();
       }
}

class HeavyMotorVehicle extends Vehicle {
          private double capacityInTons;
          
          public HeavyMotorVehicle(String Company , double price , double capacityInTons){
                super(Company , price);
                this.capacityInTons = capacityInTons;
          }

          public void displayInfo(){
              System.out.println("Company : " + Company);
              System.out.println( "Price : "+ Price);
              System.out.println("Capacity in tons :" + capacityInTons);
              System.out.println();
          }

}

public class VehicalProgram{
        public static void main(String[] args){
                
                Scanner sc = new Scanner(System.in);
                
                
                System.out.print("Number of vehicles ? :");
                int n = sc.nextInt();

                LightMotorVehicle[] l = new LightMotorVehicle[n];
                HeavyMotorVehicle[] h = new HeavyMotorVehicle[n];


                System.out.println("Type of Vehicle ? \n 1 . Light motor vehicle(type 1) \n 2. Heavy motor vehicle(type 2) \n");
                int typeNo = sc.nextInt();

                for(int i = 0 ; i < n ; i++){
                     System.out.println("Fill all the details: ");
                     if (typeNo == 1){
                          
                            System.out.print("Enter the Company: ");
                            String comp = sc.next();
                            System.out.print("Enter the Price: ");
                            double price = sc.nextDouble();
                            System.out.print("Enter the Mileage: ");
                            double mileage = sc.nextDouble();
                            LightMotorVehicle lmV = new LightMotorVehicle(comp,price,mileage);
                            l[i] = lmV;
                     }else if (typeNo == 2){
                           
                            System.out.print("Enter the Company: ");
                            String comp = sc.next();
                            System.out.print("Enter the Price: ");
                            double price = sc.nextDouble();
                            System.out.print("Enter the Capacity In Tons: ");
                            double capacityInTons = sc.nextDouble();
                            HeavyMotorVehicle hmV = new HeavyMotorVehicle(comp,price,capacityInTons);
                            h[i] = hmV;
                     }
                }

                for(int i = 0 ; i < n ; i++){
                     if (typeNo == 1){
                            l[i].displayInfo();
                     }else if(typeNo == 2){
                          h[i].displayInfo();
                     }
                }

        }
}

