/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puanlama_ekleme;
import java.sql.Date;
/**
 *
 * @author loop
 */
public class user_ {

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getIlac_id() {
        return ilac_id;
    }

    public void setIlac_id(int ilac_id) {
        this.ilac_id = ilac_id;
    }
    private String adi,soyadi;
     private int yas,ilac_id,puani;

    public int getPuani() {
        return puani;
    }

    public void setPuani(int puani) {
        this.puani = puani;
    }
    
}
