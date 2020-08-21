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

/**
 *
 * @author asus
 */
public class ThongKeDao {
   public List<Object[]> getTatca() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "SELECT * FROM BaiViet";
                rs = JdbcHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("maBV"),
                        rs.getString("tieuDe"),
                        rs.getDate("ngayTao"),
                        rs.getString("moTa"),
                        rs.getString("hinhBV")
                    };
                    list.add(model);

                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);

        }
        return list;

    }  
 public List<Object[]> getThang() {
         List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "SELECT * FROM BaiViet";
                rs = JdbcHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("maBV"),
                        rs.getString("tieuDe"),
                        rs.getDate("ngayTao"),
                        rs.getString("moTa"),
                        rs.getString("hinhBV")
                    };
                    list.add(model);

                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);

        }
        return list;
    }
 public List<Object[]> getnam() {
         List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "SELECT * FROM BaiViet";
                rs = JdbcHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("maBV"),
                        rs.getString("tieuDe"),
                        rs.getDate("ngayTao"),
                        rs.getString("moTa"),
                        rs.getString("hinhBV")
                    };
                    list.add(model);

                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);

        }
        return list;
    }
}
