import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        String url ="jdbc:mysql://localhost:3307/office";
        String username = "root";
        String password = "Hritik.2018";
        String query = "Select * from employees";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded Successfully.");
        }catch(ClassNotFoundException e){
            System.out.printf(e.getMessage());
        }


        try{
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");

                System.out.println("");
                System.out.println("===============");

                System.out.println("Id: "+ id);
                System.out.println("Name: "+ name);
                System.out.println("Job title: "+ job_title);
                System.out.println("Salary: "+ salary);
            }
            rs.close();
            stmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection Closed Successfully!!!");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}