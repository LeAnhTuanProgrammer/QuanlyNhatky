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
import model.NguoiDung;

/**
 *
 * @author asus
 */
public class NguoiDungDao {
JdbcHelper jdbc=new JdbcHelper();
    public void insert(NguoiDung model) {
        String sql = "INSERT INTO NguoiDung (maND, tenND, matKhau, gioiTinh, namSinh, hinhND, quocTich) VALUES (?, ?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaND(),
                model.getTenND(),
                model.getMatKhau(),
                model.isGioiTinh(),
                model.getNamSinh(),
                model.getHinhND(),
                model.isQuocTich());
        
    }

    public void update(NguoiDung model) {
        String sql = "UPDATE NguoiDung SET tenND=?, matkhau=?, gioiTinh=? ,namSinh=? ,hinhND=?,  quocTich=? WHERE maND=?";
        JdbcHelper.executeUpdate(sql,
                  model.getMaND(),
                model.getTenND(),
                model.getMatKhau(),
                model.isGioiTinh(),
                model.getNamSinh(),
                model.getHinhND(),
                model.isQuocTich());
    }

    public void delete(String maND) {
        String sql = "DELETE FROM NguoiDung WHERE maND=?";
        JdbcHelper.executeUpdate(sql, maND);
    }

    public List<NguoiDung> select() {
        String sql = "SELECT * FROM NguoiDung";
        return select(sql);
    }

    public NguoiDung findById(String maBV) {
        String sql = "SELECT * FROM NguoiDung WHERE maBV=?";
        List<NguoiDung> list = select(sql, maBV);
        return list.size() > 0 ? list.get(0) : null;
    }
     public NguoiDung findByTen(String tenND) {
        String sql = "SELECT * FROM NguoiDung WHERE tenND=?";
        List<NguoiDung> list = select(sql, tenND);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<NguoiDung> select(String sql, Object... args) {
        List<NguoiDung> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NguoiDung model = readFromResultSet(rs);
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

    private NguoiDung readFromResultSet(ResultSet rs) throws SQLException {
        NguoiDung model = new NguoiDung();
        model.setMaND(rs.getString("maND"));
        model.setTenND(rs.getString("tenND"));
         model.setMatKhau(rs.getString("matKhau"));
                model.setGioiTinh(rs.getBoolean("gioiTinh"));
                model.setNamSinh(rs.getDate("namSinh"));
                model.setHinhND(rs.getString("hinhND"));
                model.setQuocTich(rs.getBoolean("quocTich"));
        
        return model;
    }
  
}
