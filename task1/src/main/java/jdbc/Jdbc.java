package jdbc;

import java.sql.*;

/**
 * Created by suhuiso on 2017/7/21.
 */
public class Jdbc {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/task1";

    static final String USER = "root";
    static final String PASS = "Sh9394,.";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()) {
                //Retrieve by column name
                int id  = rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                int num = rs.getInt("c_num");
                long updateAt = rs.getLong("update_at");
                long createAt = rs.getLong("create_at");
                String declaration = rs.getString("declaration");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.print(", Type: " + type);
                System.out.print(", Course Num: " + num);
                System.out.print(", Update At: " + updateAt);
                System.out.print(", Create At: " + createAt);
                System.out.println(", Declaration: " + declaration);
            }

            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Error: unable to load driver class!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        } finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
                if(conn!=null)
                    conn.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        System.out.println("\n Loading Done!");
    }
}
