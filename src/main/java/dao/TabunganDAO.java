/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import koneksi.ConnectDB;
import model.Tabungan;

/**
 *
 * @author St0rm
 */
public class TabunganDAO {
     private Connection connection;
     public TabunganDAO(){
         ConnectDB cd = new ConnectDB();
         this.connection = cd.getConnection();
     }
     public void save(Tabungan tabungan) throws SQLException{
         String sqlinsert = ""
                 +"insert into mst_tabungan(id_tabungan,id_nasabah,saldo,nama_tabungan)"
                 +"values(nextval('mst_tabungan_id_tabungan_seq'),?,?,?)";
         PreparedStatement ps = connection.prepareStatement(sqlinsert);
         ps.setInt(1, tabungan.getNasabah().getIdNasabah());
         ps.setInt(2, tabungan.getSaldo().intValue());
         ps.setString(3, tabungan.getNamaTabungan());
         ps.executeUpdate();
         ps.close();
         connection.commit();
         connection.close();
         System.out.println("Tabungan berhasil ditambahkan");
     }
}
