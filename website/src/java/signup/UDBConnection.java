package signup;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UDBConnection implements Serializable {
    PreparedStatement statement;
   private  String sql= "insert into usertable (username,email,password) values (?,?,?)";
    private int status=0;
    public int addDetails(UserBean data) {
        try {
           
            
            connectToDB();
             
            statement.setString(1, data.getUsername());
            statement.setString(2, data.getEmail());
            statement.setString(3, data.getPassword());
             status=statement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UDBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         if(status==1){
                 return status;
             }
             else 
                 return status;
     }

   public void connectToDB() {
         try {
            
             try {
                  String driver="com.mysql.jdbc.Driver";
                 Class.forName(driver);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(UDBConnection.class.getName()).log(Level.SEVERE, null, ex);
             }
             String url="jdbc:mysql://localhost:3306/userdetails";
             Connection connection=(Connection) DriverManager.getConnection(url, "root", "");
            statement=connection.prepareStatement(sql);
         } catch (SQLException ex) {
             Logger.getLogger(UDBConnection.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }

   
    
}
