/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.ConnectDB;
import model.Nasabah;

/**
 *
 * @author St0rm
 */
public class NasabahDAO {
      private Connection connection;
      public NasabahDAO(){
          ConnectDB cd = new ConnectDB();
          this.connection = cd.getConnection();
      }
      public void save(Nasabah nasabah) throws SQLException{
          String sqlinsert = ""
                  +"insert into mst_nasabah(id_nasabah, nama_nasabah, alamat)"
                  +"values (nextval('mst_nasabah_id_nasabah_seq'),?,?)";
          PreparedStatement ps = connection.prepareStatement(sqlinsert);
          ps.setString(1, nasabah.getNamaNasabah());
          ps.setString(2, nasabah.getAlamat());
          ps.executeUpdate();
          ps.close();
          connection.commit();
          connection.close();
          System.out.println("Memasukkan Data berhasil");
      }
      public Nasabah getNasabahByID(Integer id) throws SQLException{
          Statement statement = connection.createStatement();
          ResultSet result = statement.executeQuery("select * from mst_nasabah where id_nasabah="+id);
          if(result.next()){
            Nasabah nasabah = new Nasabah(result.getInt(1),result.getString(2),result.getString(3));
            return nasabah;
          }else{
            return null;
          }
      }
      public void delete(Integer nasabahId) throws SQLException{
          String sqldelete = "delete from mst_nasabah where id_nasabah=?";
          PreparedStatement ps = connection.prepareStatement(sqldelete);
          ps.setInt(1, nasabahId);
          ps.executeUpdate();
          ps.close();
          connection.commit();
          connection.close();
      }
}
