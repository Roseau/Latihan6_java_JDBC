/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author St0rm
 */
public class Tabungan {
    private Integer idTabungan;
    private String namaTabungan;
    private BigDecimal saldo;
    private Nasabah nasabah;
    private TransaksiTabungan transaksitabungan;
    private List<TransaksiTabungan> listTransaksi = new ArrayList<>();

    public Tabungan(Integer idTabungan, String namaTabungan, BigDecimal saldo, Nasabah nasabah) {
        this.idTabungan = idTabungan;
        this.namaTabungan = namaTabungan;
        this.saldo = saldo;
        this.nasabah = nasabah;
    }
    
    public Integer getIdTabungan() {
        return idTabungan;
    }

    public void setIdTabungan(Integer idTabungan) {
        this.idTabungan = idTabungan;
    }

    public String getNamaTabungan() {
        return namaTabungan;
    }

    public void setNamaTabungan(String namaTabungan) {
        this.namaTabungan = namaTabungan;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }

    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

    public List<TransaksiTabungan> getListTabungan() {
        return listTransaksi;
    }

    public void addListTransaksiTabungan(TransaksiTabungan trantab) {
        listTransaksi.add(trantab);
    }
}
