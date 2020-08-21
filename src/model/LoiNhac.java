/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author asus
 */
public class LoiNhac {
     private String maND;
 private String chuDe;
 private Date ngayNhac;
 private String LoiNhac;
 @Override
 public String toString() {
 return this.toString(); 
}

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public String getChuDe() {
        return chuDe;
    }

    public void setChuDe(String chuDe) {
        this.chuDe = chuDe;
    }

    public Date getNgayNhac() {
        return ngayNhac;
    }

    public void setNgayNhac(Date ngayNhac) {
        this.ngayNhac = ngayNhac;
    }

    public String getLoiNhac() {
        return LoiNhac;
    }

    public void setLoiNhac(String LoiNhac) {
        this.LoiNhac = LoiNhac;
    }
}
