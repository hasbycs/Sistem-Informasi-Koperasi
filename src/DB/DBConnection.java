package DB;
import java.sql.*;
public class DBConnection {  

    public static Connection ConnectDB() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   
    private Connection conn = null;
    
    public Connection setConnection(){
        try
        {  
            String username = "root";
            String password="";
            String url="jdbc:mysql://localhost:3306/db_koperasi"; 
            try
            {
                  Class.forName("com.mysql.jdbc.Driver");
                  System.out.println("Class JDBC Ditemukan");
            }
            catch(ClassNotFoundException enfe)
            {
                  System.out.println("Class JDBC Tidak Ditemukan");
            }  
                  conn = DriverManager.getConnection(url, username, password);
        }
            catch (SQLException se){
        }
        return conn;
    }
}
