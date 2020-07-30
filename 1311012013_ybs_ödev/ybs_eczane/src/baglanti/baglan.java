/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baglanti;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author loop
 */
public class baglan {
    private String url ="jdbc:mysql://localhost:3306/";
    private String driver ="com.mysql.jdbc.Driver";
    private String dbname ="ybs_ilac";
    private String username ="root";
    private String password ="";
    
    public Connection con;
    
     public void veritabanibaglan(){
          
  

}
     
     
      public boolean Connect() {
        try {
            System.out.println("Connecting MySQL Database...");
            Class.forName("com.mysql.jdbc.Connection");
            con = (Connection) DriverManager.getConnection(url+dbname, username, password);

            System.out.println("Database Connected...");
            return true;
        } catch (Exception e) {
            try {
                System.out.println("Database not found..\n Please wait.. ");
                Restoredbfromsql("asd");
                Connect();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

            return false;
        }
    }

    public boolean disConnect() {
        try {
            System.out.println("MySQL Database disconnecting...");
            getCon().close();
            System.out.println("Database Disconneted...");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Can not disconnect database...\n Error:  " + e.getMessage());
            return false;
        }
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    private void Restoredbfromsql(String asd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
