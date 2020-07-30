/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puanlama_ekleme;

import baglanti.baglan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author loop
 */


public class  db_work
{

ResultSet rs;
PreparedStatement ps;

   
    public int eskipuan_Cekme(int ilac_id) throws SQLException {
        //veri tabanına bağlanarak eski ialc puanını bu kısımda çekiyoruz
        baglan dbcon = new baglan();
        dbcon.Connect();
        
        String sql = "Select puani from ilaclar where ilac_id=? ";
         int status = 0;
       try {              
        
        PreparedStatement ps = dbcon.con.prepareStatement(sql);
        ps.setInt(1, ilac_id);       
        rs = ps.executeQuery();
        
            
            while (rs.next()) {
                status=rs.getInt(1);
                System.out.println("VERi TABANINDAN ALINAN ESKİ PUAN ="+ status );
            }
            
            return status;
        
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(e.getMessage());
            return 0;
            } finally {
            dbcon.disConnect();
            
            }
   
        
    
    
}
    
     
    public int puan_güncelleme(int puani,int ilac_id) throws SQLException {
        
        //burada ise eski ilac puanının üzerine yani kullanıcının dönütü ile yeni puanlama sonucu veritabanında güncelleniyor
        baglan dbcon = new baglan();
        dbcon.Connect();
        
        String sql = "update ilaclar set puani=?  where ilac_id=?";
         int status = 0;
       try {             
        
        PreparedStatement ps = dbcon.con.prepareStatement(sql);
        ps.setInt(1,puani);       
        ps.setInt(2,ilac_id);
        ps.executeUpdate();   
           System.out.println("YENİ PUAN GÜNCELLEMESİ VERİTABANINDA YAPILMIŞTIR");
       }
         catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.out.println("Error: "+e.getMessage());
        } finally {
            dbcon.disConnect();
}
    return 0;
    
        }
    
    

    
     public void yeni_ekle(String adi, String soyadi, int yas) throws SQLException {
       baglan dbcon = new baglan();
        dbcon.Connect();
        //burada ise dönüt yapan kullanıcının bilgileri alınıyor
        
        
        String sql = "insert into hastabilg(adi,soyadi, yasi) values (?,?,?);";
        try {PreparedStatement ps = dbcon.con.prepareStatement(sql);
        ps.setString(1, adi);
        ps.setString(2, soyadi);
        ps.setInt(3, yas);
        ps.executeUpdate();
     }
     catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.out.println("Error: "+e.getMessage());
        } finally {
            dbcon.disConnect();
}
    
    
    
    
    
    
    
     }
}
