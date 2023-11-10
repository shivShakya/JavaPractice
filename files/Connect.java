import java.sql.*;
import java.util.Scanner;

class Connect {
    public static void main(String[] args) {
        try {
            // Input
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the id:");
            int id = sc.nextInt();
            System.out.println("Enter the name:");
            String name = sc.next();
            System.out.println("Enter the course:");
            String course = sc.next();

            String query = "insert into students values (" + id + ", '" + name + "', '" + course + "');";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_work", "root", "doremon#22");
            Statement stmt = con.createStatement();
            int rs = stmt.executeUpdate(query);
            System.out.println(rs);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
