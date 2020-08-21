/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.BaiViet;
import model.LoiNhac;

/**
 *
 * @author asus
 */
public class BaiVietDao {
    
 public void insert(BaiViet model) {
       String sql = "INSERT INTO BaiViet (maBV, tieuDe, hinhBV, ngayTao, moTa) VALUES (?, ?, ?, ?, ?)";
       
        JdbcHelper.executeUpdate(sql,
                model.getMaBV(),
               
                model.getTieuDe(),
                model.getHinhBV(),
                 new java.sql.Date(model.getNgayTao().getTime()),
                 model.getMoTa());
               
    }

    public void update(BaiViet model) {
        String sql = "UPDATE BaiViet SET  tieuDe=?, hinhBV=?,ngayTao=?,moTa=? WHERE maBV=?";
        JdbcHelper.executeUpdate(sql,
              
               
                model.getTieuDe(),
                model.getHinhBV(),
                 new java.sql.Date(model.getNgayTao().getTime()),
                 model.getMoTa());
    }

    public void delete(String maBV) {
        String sql = "DELETE FROM BaiViet WHERE maBV=?";
        JdbcHelper.executeUpdate(sql, maBV);
    }

    public List<BaiViet> select() {
        String sql = "SELECT * FROM BaiViet";
        return select(sql);
    }
     public List<BaiViet> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM BaiViet WHERE ngayTao LIKE ?";
        return select(sql, "%" + keyword + "%");
    }

   

    private List<BaiViet> select(String sql, Object... args) {
        List<BaiViet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    BaiViet model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private BaiViet readFromResultSet(ResultSet rs) throws SQLException {
        BaiViet model = new BaiViet();
        model.setMaBV(rs.getString("maBV"));
       
       model.setTieuDe(rs.getString("tieuDe"));
        model.setHinhBV(rs.getString("hinhBV"));
        model.setNgayTao(rs.getDate("ngayTao"));
        model.setMoTa(rs.getString("moTa"));
        return model;
    }

}

