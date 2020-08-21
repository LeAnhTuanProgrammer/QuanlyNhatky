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
public class BaiViet {
     private String maBV;
     
 private String tieuDe;
 private String hinhBV;
 private Date ngayTao;
 private String moTa;
 @Override
 public String toString() {
 return this.tieuDe;
}

    public String getMaBV() {
        return maBV;
    }

    public void setMaBV(String maBV) {
        this.maBV = maBV;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getHinhBV() {
        return hinhBV;
    }

    public void setHinhBV(String hinhBV) {
        this.hinhBV = hinhBV;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

  
}
 
