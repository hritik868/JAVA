import java.sql.*;

public class deleteData {

    public static void main(String[] args) throws ClassNotFoundException {

        String url ="jdbc:mysql://localhost:3307/office";
        String username = "root";
        String password = "Hritik.2018";
        String query = "delete from employees where salary=45000";

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
            int rowsaffected = stmt.executeUpdate(query);

            if (rowsaffected>0){
                System.out.println("Deleted Seccessfully " +rowsaffected+" row(s) affected.");
            }else{
                System.out.println("Deletion failed!!!");
            }

            stmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection Closed Successfully!!!");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

