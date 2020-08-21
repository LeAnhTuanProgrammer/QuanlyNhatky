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
import model.LoiNhac;


/**
 *
 * @author asus
 */
public class LoiNhacDao {
      
 public void insert(LoiNhac model) {
        String sql = "INSERT INTO LoiNhac(maBV, maND, tieuDe, hinhBV, ngayTao, moTa) VALUES(?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaND(),
                model.getChuDe(),
                model.getNgayNhac(),
                model.getLoiNhac());
              
                 
    }

    public void update(LoiNhac model) {
        String sql = "UPDATE LoiNhac SET maND=?, tieuDe=?, hinhBV=?, ngayTao=?, moTa=? WHERE maBV=?";
        JdbcHelper.executeUpdate(sql,
               model.getMaND(),
                model.getChuDe(),
                model.getNgayNhac(),
                model.getLoiNhac());
    }

    public void delete(String maBV) {
        String sql = "DELETE FROM LoiNhac WHERE maBV=?";
        JdbcHelper.executeUpdate(sql, maBV);
    }

    public List<LoiNhac> select() {
        String sql = "SELECT * FROM LoiNhac";
        return select(sql);
    }
     public List<LoiNhac> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM LoiNhac WHERE ngayTao LIKE ?";
        return select(sql, "%" + keyword + "%");
    }

    public LoiNhac findById(String maND) {
        String sql = "SELECT * FROM LoiNhac WHERE maND=?";
        List<LoiNhac> list = select(sql, maND);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<LoiNhac> select(String sql, Object... args) {
        List<LoiNhac> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    LoiNhac model = readFromResultSet(rs);
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

    private LoiNhac readFromResultSet(ResultSet rs) throws SQLException {
        LoiNhac model = new LoiNhac();
        model.setMaND(rs.getString("maND"));
         model.setChuDe(rs.getString("chuDe"));
       model.setNgayNhac(rs.getDate("ngayNhac"));
        model.setLoiNhac(rs.getString("loiNhac"));
       
        return model;
    }
 
}
