/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.sql.JDBCType.DATE;
import java.util.Date;

/**
 *
 * @author asus
 */
public class NguoiDung {
    private String maND;
    private String maBV;
   private String tenND;
   private String matKhau;
     private boolean gioiTinh;
     private Date namSinh;
   private String hinhND;
   private boolean quocTich;
 @Override
 public String toString() {
 return this.tenND;
 }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public String getMaBV() {
        return maBV;
    }

    public void setMaBV(String maBV) {
        this.maBV = maBV;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public String getHinhND() {
        return hinhND;
    }

    public void setHinhND(String hinhND) {
        this.hinhND = hinhND;
    }

    public boolean isQuocTich() {
        return quocTich;
    }

    public void setQuocTich(boolean quocTich) {
        this.quocTich = quocTich;
    }

}
