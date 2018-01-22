/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.asboyo.latihan6;

import dao.NasabahDAO;
import dao.TabunganDAO;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Nasabah;
import model.Tabungan;

/**
 *
 * @author St0rm
 */
public class MainApp {
    public static void main(String[] args) {
        NasabahDAO ndao = new NasabahDAO();
        TabunganDAO tdao = new TabunganDAO();
          //memasukkan nasabah baru
//        try {
//            ndao.save(new Nasabah(null,"Hilman Ramadhan","Ujung Berung"));
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
          //menampilkan nasabah
//        try {
//            System.out.println(ndao.getNasabahByID(2).toString());
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        BigDecimal b = new BigDecimal(500000);
//        try {
//            tdao.save(new Tabungan(null,"Tabungan Umroh",b,ndao.getNasabahByID(3)));
//        } catch (SQLException ex) {
//            System.out.println(ex);
//            ex.printStackTrace();
//        }
          
    }
}
