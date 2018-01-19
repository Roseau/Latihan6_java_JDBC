/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author St0rm
 */
public class TransaksiTabungan {
    private Integer idTransaksi;
    private Integer jenisTransaksi;
    private Date tanggalTransaksi;
    private BigDecimal saldo, debet, kredit;

    public TransaksiTabungan(Integer idTransaksi, Integer jenisTransaksi, Date tanggalTransaksi, BigDecimal saldo, BigDecimal debet, BigDecimal kredit) {
        this.idTransaksi = idTransaksi;
        this.jenisTransaksi = jenisTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.saldo = saldo;
        this.debet = debet;
        this.kredit = kredit;
    }

    public Integer getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Integer getJenisTransaksi() {
        return jenisTransaksi;
    }

    public void setJenisTransaksi(Integer jenisTransaksi) {
        this.jenisTransaksi = jenisTransaksi;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getDebet() {
        return debet;
    }

    public void setDebet(BigDecimal debet) {
        this.debet = debet;
    }

    public BigDecimal getKredit() {
        return kredit;
    }

    public void setKredit(BigDecimal kredit) {
        this.kredit = kredit;
    }
    
    
}
