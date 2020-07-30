/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ybs_eczane;


import baglanti.baglan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author loop
 */
public class giris {
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean sistemgirisi(String username, String password) throws SQLException{
        baglan veritabaniBaglan = new baglan();
        veritabaniBaglan.veritabanibaglan();
        return true;        
       
   
}}
