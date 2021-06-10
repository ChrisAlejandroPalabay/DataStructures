package Graph;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {

    private Connection con;
    private Statement st;
    private ResultSet rs;


    public DbConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Family";
            con = DriverManager.getConnection(url,"root","");
            st = con.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getData(){
        try{
            String query = "SELECT * FROM `FamilyMembers`";
            rs = st.executeQuery(query);
            System.out.println("Records from db");
            while(rs.next()){
                String fname = rs.getString("firstName");
                String lname = rs.getString("LastName");
                String gender = rs.getString("gender");
                String bday = rs.getString("birthday");

                System.out.println(fname + " " + lname + " " + gender + " " + bday);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
